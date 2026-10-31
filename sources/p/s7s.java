package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import androidx.media3.session.legacy.PlaybackStateCompat;
import app.p000rive.semantics.SemanticState;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Locale;
import org.chromium.net.UploadDataProvider;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class s7s implements Function, e9d0, j9a0, e2i0, akl, SingleOnSubscribe {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ s7s(o0u0 o0u0Var, int i) {
        this.a = (byte) 1;
        this.c = o0u0Var;
        this.b = i;
    }

    public void accept(Object obj) {
        ((ffu0) obj).r((po7) this.c, this.b);
    }

    public Object apply(Object obj) {
        f410 f410Var;
        k310 k310Var;
        byte b = this.a;
        boolean z = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                v7s v7sVar = (v7s) obj2;
                ou80 ou80Var = (ou80) obj;
                if (z) {
                    v7sVar.b.b().b(ou80Var.a);
                }
                return LoggingParams.builder().interactionId(ou80Var.a).build();
            default:
                z310 z310Var = (z310) obj;
                return (!z || (f410Var = z310Var.b) == null || (k310Var = f410Var.c) == null) ? Observable.just(z310Var) : new ObservableFromPublisher(((vvc0) obj2).k).map(new hfr(k310Var.b, (byte) 5)).distinctUntilChanged().map(new bf70(z310Var, (byte) 23));
        }
    }

    public Object i(fzh0 fzh0Var, ixh0 ixh0Var, int i) {
        int iQ0;
        byte b = this.a;
        long jV = -9223372036854775807L;
        int iQ1 = -1;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 5:
                try {
                    bg11 bg11VarT = b380.t(yoh0.b(ixh0Var.c, (Bundle) obj));
                    if (z) {
                        iQ0 = -1;
                    } else {
                        fzh0Var.C();
                        iQ0 = fzh0Var.t.Q0();
                    }
                    if (!z) {
                        fzh0Var.C();
                        jV = fzh0Var.t.v();
                    }
                    return fzh0Var.x(ixh0Var, bg11VarT, iQ0, jV);
                } catch (RuntimeException e) {
                    oon1.I("Ignoring malformed Bundle for MediaItem", e);
                    return new c280(e);
                }
            default:
                try {
                    b380 b380VarA = occ.a((IBinder) obj);
                    v280 v280VarM = b380.m();
                    for (int i2 = 0; i2 < b380VarA.size(); i2++) {
                        Bundle bundle = (Bundle) b380VarA.get(i2);
                        bundle.getClass();
                        v280VarM.c(yoh0.b(ixh0Var.c, bundle));
                    }
                    bg11 bg11VarG = v280VarM.g();
                    if (!z) {
                        fzh0Var.C();
                        iQ1 = fzh0Var.t.Q0();
                    }
                    int i3 = iQ1;
                    if (!z) {
                        fzh0Var.C();
                        jV = fzh0Var.t.v();
                    }
                    return fzh0Var.x(ixh0Var, bg11VarG, i3, jV);
                } catch (RuntimeException e2) {
                    oon1.I("Ignoring malformed Bundle for MediaItem", e2);
                    return new c280(e2);
                }
        }
    }

    public void invoke(Object obj) {
        ((o8u0) obj).C0(((o0u0) this.c).a, this.b ? 1 : 0);
    }

    public void run() throws IOException {
        byte b = 1;
        byte b2 = 0;
        switch (this.a) {
            case 2:
                g9a0 g9a0Var = (g9a0) this.c;
                boolean z = this.b;
                axh1 axh1Var = g9a0Var.d;
                long length = ((UploadDataProvider) axh1Var.b).getLength();
                g9a0Var.f = length;
                if (length != 0) {
                    if (length <= 0 || length >= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        g9a0Var.e = ByteBuffer.allocateDirect(SemanticState.Multiline);
                    } else {
                        g9a0Var.e = ByteBuffer.allocateDirect(((int) length) + 1);
                    }
                    long j = g9a0Var.f;
                    HttpURLConnection httpURLConnection = g9a0Var.i;
                    if (j > 0) {
                        httpURLConnection.setFixedLengthStreamingMode(j);
                    } else {
                        httpURLConnection.setChunkedStreamingMode(SemanticState.Multiline);
                    }
                    if (!z) {
                        g9a0Var.a.set(1);
                        axh1Var.rewind(g9a0Var);
                    } else {
                        g9a0Var.a(new z8a0(g9a0Var.m, new v8a0(g9a0Var, b2), (byte) 2), "startRead");
                    }
                } else {
                    if (g9a0Var.k != null && g9a0Var.j.compareAndSet(false, true)) {
                        g9a0Var.k.close();
                    }
                    i9a0 i9a0Var = g9a0Var.m;
                    i9a0Var.l = 13;
                    i9a0Var.c(new z8a0(i9a0Var, new a9a0(i9a0Var, (byte) 0), (byte) 2), "fireGetHeaders");
                }
                break;
            default:
                w8a0 w8a0Var = (w8a0) this.c;
                boolean z2 = this.b;
                long j2 = w8a0Var.f;
                if (j2 != -1 && j2 - w8a0Var.g < w8a0Var.e.remaining()) {
                    w8a0Var.c(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(w8a0Var.g + ((long) w8a0Var.e.remaining())), Long.valueOf(w8a0Var.f))));
                } else if (w8a0Var.e.remaining() == 0 && !z2) {
                    w8a0Var.c(new IllegalStateException("Bytes read can't be zero except for last chunk!"));
                } else {
                    long j3 = w8a0Var.g;
                    ByteBuffer byteBuffer = w8a0Var.e;
                    g9a0 g9a0Var2 = (g9a0) w8a0Var;
                    int iWrite = 0;
                    while (byteBuffer.hasRemaining()) {
                        iWrite += g9a0Var2.k.write(byteBuffer);
                    }
                    g9a0Var2.l.flush();
                    long j4 = j3 + ((long) iWrite);
                    w8a0Var.g = j4;
                    long j5 = w8a0Var.f;
                    if (j4 < j5 || (j5 == -1 && !z2)) {
                        w8a0Var.a.set(0);
                        w8a0Var.b(new v8a0(w8a0Var, b), "readFromProvider");
                    } else if (j5 == -1) {
                        if (g9a0Var2.k != null && g9a0Var2.j.compareAndSet(false, true)) {
                            g9a0Var2.k.close();
                        }
                        i9a0 i9a0Var2 = g9a0Var2.m;
                        i9a0Var2.l = 13;
                        i9a0Var2.c(new z8a0(i9a0Var2, new a9a0(i9a0Var2, (byte) 0), (byte) 2), "fireGetHeaders");
                    } else if (j5 != j4) {
                        w8a0Var.c(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(w8a0Var.g), Long.valueOf(w8a0Var.f))));
                    } else {
                        if (g9a0Var2.k != null && g9a0Var2.j.compareAndSet(false, true)) {
                            g9a0Var2.k.close();
                        }
                        i9a0 i9a0Var3 = g9a0Var2.m;
                        i9a0Var3.l = 13;
                        i9a0Var3.c(new z8a0(i9a0Var3, new a9a0(i9a0Var3, (byte) 0), (byte) 2), "fireGetHeaders");
                    }
                }
                break;
        }
    }

    public void subscribe(SingleEmitter singleEmitter) {
        vrv0 vrv0Var = (vrv0) this.c;
        singleEmitter.setCancellable(new u241(vrv0Var, singleEmitter, (byte) 1));
        ((ArrayList) vrv0Var.e).add(singleEmitter);
        w741 w741Var = (w741) vrv0Var.c;
        if (this.b) {
            w741Var.getClass();
            Intent intentB = w741.b("com.msc.action.samsungaccount.REQUEST_NEW_THIRD_PARTY_INTEGRATION_WITH_SAMSUNG_ACCOUNT");
            intentB.putExtra("progress_theme", "dark");
            vrv0Var.g(intentB, 1213);
            return;
        }
        String packageName = w741Var.a.getPackageName();
        Intent intentB2 = w741.b("com.osp.app.signin.action.ADD_SAMSUNG_ACCOUNT");
        intentB2.putExtra("mypackage", packageName);
        intentB2.putExtra("osp_ver", "OSP_02");
        intentB2.putExtra("mode", "ADD_ACCOUNT");
        vrv0Var.g(intentB2, 1212);
    }

    public /* synthetic */ s7s(Object obj, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }
}
