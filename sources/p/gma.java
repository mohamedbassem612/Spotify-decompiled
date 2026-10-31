package p;

import com.spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperEsperanto;
import com.spotify.base.java.logging.Logger;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gma {
    public final vv8 a;
    public y48 b;

    public gma(vv8 vv8Var) {
        this.a = vv8Var;
        this.b = (y48) vv8Var.invoke();
    }

    public final Long a(boolean z, int i, xw7 xw7Var, int i2) {
        p48 p48Var;
        this.b = (y48) this.a.invoke();
        o48 o48VarN = AudioSinkChainWrapperEsperanto.AudioFormat.n();
        o48VarN.r(i);
        o48VarN.q();
        if (i2 != 1) {
            p48Var = i2 != 2 ? p48.d : p48.c;
        } else {
            p48Var = p48.b;
        }
        o48VarN.n(p48Var);
        AudioSinkChainWrapperEsperanto.AudioFormat audioFormatBuild = o48VarN.build();
        q48 q48VarN = AudioSinkChainWrapperEsperanto.CreateRequest.n();
        q48VarN.q(z);
        q48VarN.n(audioFormatBuild);
        if (xw7Var != null) {
            q48VarN.r(xw7Var.a());
            q48VarN.s(xw7Var.b());
        }
        try {
            return Long.valueOf(((AudioSinkChainWrapperEsperanto.CreateResponse) this.b.a(q48VarN.build()).blockingGet()).n());
        } catch (Exception e) {
            Logger.e(e, "Error creating sink chain", new Object[0]);
            return null;
        }
    }

    public final ByteBuffer b(long j) {
        v48 v48VarN = AudioSinkChainWrapperEsperanto.ReadRequest.n();
        v48VarN.n(j);
        AudioSinkChainWrapperEsperanto.ReadRequest readRequestBuild = v48VarN.build();
        try {
            y48 y48Var = this.b;
            readRequestBuild.getClass();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(((AudioSinkChainWrapperEsperanto.ReadResponse) y48Var.b(readRequestBuild).blockingGet()).n().o().t());
            byteBufferWrap.getClass();
            return byteBufferWrap;
        } catch (Exception e) {
            Logger.e(e, "Error reading from sink chain", new Object[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
            byteBufferAllocate.getClass();
            return byteBufferAllocate;
        }
    }

    public final boolean c(ByteBuffer byteBuffer, long j, boolean z) {
        try {
            u48 u48VarP = AudioSinkChainWrapperEsperanto.PcmAudioBuffer.p();
            u48VarP.n(phc.f(byteBuffer));
            AudioSinkChainWrapperEsperanto.PcmAudioBuffer pcmAudioBufferBuild = u48VarP.build();
            x48 x48VarN = AudioSinkChainWrapperEsperanto.WriteRequest.n();
            x48VarN.q(j);
            x48VarN.r(pcmAudioBufferBuild);
            x48VarN.n(z);
            AudioSinkChainWrapperEsperanto.WriteRequest writeRequestBuild = x48VarN.build();
            y48 y48Var = this.b;
            writeRequestBuild.getClass();
            return ((AudioSinkChainWrapperEsperanto.WriteResponse) y48Var.c(writeRequestBuild).blockingGet()).n();
        } catch (Exception e) {
            Logger.e(e, "Error writing to sink chain", new Object[0]);
            return false;
        }
    }
}
