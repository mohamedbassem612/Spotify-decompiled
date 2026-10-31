package p;

import androidx.media3.muxer.MuxerException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class spm0 implements ahn0 {
    public static final bg11 g;
    public static final bg11 h;
    public final s420 a;
    public final zsc b;
    public final vpm0 c;
    public final ArrayList d;
    public final ArrayList e;
    public int f;

    static {
        w280 w280Var = b380.b;
        Object[] objArr = {"video/av01", "video/3gpp", "video/avc", "video/hevc", "video/mp4v-es", "video/x-vnd.on2.vp9", "video/apv", "video/dolby-vision"};
        i8p1.l(8, objArr);
        g = b380.l(8, objArr);
        Object[] objArr2 = {"audio/mp4a-latm", "audio/3gpp", "audio/amr-wb", "audio/opus", "audio/vorbis", "audio/raw", "audio/iamf"};
        i8p1.m(objArr2);
        h = b380.l(7, objArr2);
    }

    public spm0(s420 s420Var, boolean z) {
        this.a = s420Var;
        zsc zscVar = new zsc((byte) 14);
        this.b = zscVar;
        this.c = new vpm0(s420Var, zscVar, false, z);
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    @Override // p.ahn0
    public final int H(ie30 ie30Var) {
        int i = this.f;
        this.f = i + 1;
        vpm0 vpm0Var = this.c;
        ejf1 ejf1Var = new ejf1(i, ie30Var, vpm0Var.c);
        ArrayList arrayList = vpm0Var.d;
        arrayList.add(ejf1Var);
        Collections.sort(arrayList, new m((byte) 23));
        this.d.add(ejf1Var);
        return i;
    }

    @Override // p.ahn0
    public final void R0(rij0 rij0Var) {
        dm5.n(mth1.C(rij0Var), "Unsupported metadata");
        this.b.c(rij0Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws MuxerException {
        MuxerException muxerException;
        try {
            vpm0 vpm0Var = this.c;
            mth1.y(0L);
            vpm0Var.b();
            muxerException = null;
        } catch (IOException e) {
            muxerException = new MuxerException("Failed to finish writing data", e);
        }
        try {
            this.a.close();
        } catch (IOException e2) {
            if (muxerException == null) {
                muxerException = new MuxerException("Failed to close output stream", e2);
            } else {
                oon1.w("Failed to close output stream", e2);
            }
        }
        if (muxerException != null) {
            throw muxerException;
        }
    }

    @Override // p.ahn0
    public final void j0(int i, ByteBuffer byteBuffer, qac qacVar) throws MuxerException {
        ArrayList arrayList = this.d;
        dm5.n(i < arrayList.size(), "Track id is invalid");
        byteBuffer.getClass();
        int i2 = qacVar.b;
        dm5.m(byteBuffer.remaining() == i2);
        ejf1 ejf1Var = (ejf1) arrayList.get(i);
        try {
            if (this.e.contains(ejf1Var)) {
                throw null;
            }
            this.c.h(ejf1Var, byteBuffer, qacVar);
        } catch (IOException e) {
            throw new MuxerException("Failed to write sample for presentationTimeUs=" + qacVar.a + ", size=" + i2, e);
        }
    }
}
