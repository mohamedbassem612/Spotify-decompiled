package p;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import com.spotify.boombox.audiosink.NativeAudioSinkChainFactory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a0c0 {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final Object g;
    public final Object h;
    public final Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f7p;
    public final Object q;

    public a0c0(s590 s590Var, q8n q8nVar, yqg yqgVar, g06 g06Var, lgy lgyVar, yna ynaVar, kma kmaVar, yfu yfuVar, boolean z, boolean z2, boolean z3, um51 um51Var, boolean z4, o2p o2pVar, boolean z5, cuw cuwVar, boolean z6) {
        gma gmaVar;
        h5u n48Var;
        Looper mainLooper;
        x590 r390Var;
        q8n q8nVar2 = s590Var.f131p;
        bjh0 bjh0Var = s590Var.k;
        ArrayList arrayList = s590Var.f;
        ps6 ps6Var = s590Var.e;
        a0b a0bVar = s590Var.d;
        yqu0 yqu0Var = s590Var.c;
        l270 l270Var = s590Var.b;
        Context context = s590Var.a;
        this.g = q8nVar;
        this.h = yqgVar;
        this.i = g06Var;
        this.j = lgyVar;
        this.k = ynaVar;
        this.l = kmaVar;
        this.m = yfuVar;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.n = um51Var;
        this.d = z4;
        this.o = o2pVar;
        this.e = z5;
        this.f7p = cuwVar;
        this.f = z6;
        boolean z7 = s590Var.B;
        f18 sg10Var = new sg10(new hu7());
        f18 xg10Var = new xg10(new iu7(0L));
        yu3 yu3Var = s590Var.n;
        jpb jpbVar = (jpb) yu3Var.b;
        jpb jpbVar2 = (jpb) yu3Var.c;
        jpb jpbVar3 = jpb.c;
        jpb jpbVar4 = jpb.a;
        if (jpbVar2 != jpbVar4) {
            n48Var = new h5u((NativeAudioSinkChainFactory) yu3Var.d, jpbVar2 == jpbVar3);
        } else if (jpbVar == jpbVar4 || (gmaVar = (gma) yu3Var.e) == null) {
            n48Var = null;
        } else {
            n48Var = new n48(gmaVar, jpbVar == jpbVar3);
        }
        List listI0 = f46.i0(new f18[]{sg10Var, xg10Var, n48Var});
        if (s590Var.A || z7) {
            if (z7) {
                HandlerThread handlerThread = new HandlerThread("Spotify.Video.Playback");
                handlerThread.start();
                mainLooper = handlerThread.getLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            Looper looper = mainLooper;
            anh0 anh0Var = s590Var.g;
            sr20 sr20Var = s590Var.h;
            boolean z8 = s590Var.i;
            bpa bpaVar = s590Var.j;
            boolean z9 = s590Var.l;
            String str = s590Var.m;
            yfu yfuVar2 = s590Var.o;
            b2b1 b2b1Var = s590Var.q;
            boolean z10 = s590Var.r;
            boolean z11 = s590Var.s;
            boolean z12 = s590Var.t;
            boolean z13 = s590Var.u;
            boolean z14 = s590Var.v;
            int i = s590Var.w;
            boolean z15 = s590Var.x;
            o5n o5nVar = s590Var.y;
            Long l = s590Var.z;
            looper.getClass();
            r390Var = new r390(context, l270Var, yqu0Var, a0bVar, ps6Var, arrayList, anh0Var, sr20Var, z8, bpaVar, bjh0Var, z9, str, listI0, yfuVar2, q8nVar2, b2b1Var, z10, z11, z12, z13, z14, i, z15, o5nVar, l, looper, s590Var.C);
        } else {
            r390Var = new x590(context, l270Var, yqu0Var, a0bVar, ps6Var, arrayList, s590Var.g, s590Var.h, s590Var.i, s590Var.j, bjh0Var, s590Var.l, s590Var.m, listI0, s590Var.o, q8nVar2, s590Var.q, s590Var.r, s590Var.s, s590Var.t, s590Var.u, s590Var.v, s590Var.w, s590Var.x, s590Var.y, s590Var.z, s590Var.C);
        }
        this.q = r390Var;
    }

    public p3u0 a(m0u0 m0u0Var, oot0 oot0Var, z77 z77Var) {
        return new p3u0((yqg) this.h, (g06) this.i, (q590) this.q, (yna) this.k, (kma) this.l, (yfu) this.m, z77Var, (lgy) this.j, m0u0Var, oot0Var, this.a, smo1.e(flo1.l((q8n) this.g, new z8n("betamax-playback-session-scope"))), this.b, this.c, (um51) this.n, this.d, (o2p) this.o, this.e, (cuw) this.f7p, this.f);
    }

    public void b() {
        ((q590) this.q).release();
    }

    public void c() {
        boolean z;
        float f;
        int i;
        Matrix matrix = (Matrix) this.q;
        float[] fArr = (float[]) this.f7p;
        oj80 oj80Var = (oj80) this.h;
        InputMethodManager inputMethodManagerD = oj80Var.d();
        View view = (View) oj80Var.b;
        if (!inputMethodManagerD.isActive(view) || ((c8e1) this.j) == null || ((hyp0) this.l) == null || ((y9e1) this.k) == null || ((n511) this.m) == null || ((n511) this.n) == null) {
            return;
        }
        kch0.e(fArr);
        elb0 elb0Var = (elb0) ((ll4) this.g).a.R0.getValue();
        if (elb0Var != null) {
            if (!elb0Var.a()) {
                elb0Var = null;
            }
            if (elb0Var != null) {
                elb0Var.u(fArr);
            }
        }
        n511 n511Var = (n511) this.n;
        n511Var.getClass();
        float f2 = -n511Var.a;
        n511 n511Var2 = (n511) this.n;
        n511Var2.getClass();
        kch0.k(f2, -n511Var2.b, fArr);
        y9g1.v(matrix, fArr);
        CursorAnchorInfo.Builder builder = (CursorAnchorInfo.Builder) this.o;
        c8e1 c8e1Var = (c8e1) this.j;
        c8e1Var.getClass();
        long j = c8e1Var.b;
        hyp0 hyp0Var = (hyp0) this.l;
        hyp0Var.getClass();
        y9e1 y9e1Var = (y9e1) this.k;
        y9e1Var.getClass();
        n511 n511Var3 = (n511) this.m;
        n511Var3.getClass();
        n511 n511Var4 = (n511) this.n;
        n511Var4.getClass();
        boolean z2 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        boolean z5 = this.f;
        builder.reset();
        builder.setMatrix(matrix);
        nbe1 nbe1Var = c8e1Var.c;
        int iG = nbe1.g(j);
        builder.setSelectionRange(iG, nbe1.f(j));
        if (!z2 || iG < 0) {
            z = z4;
        } else {
            int iO = hyp0Var.o(iG);
            n511 n511VarC = y9e1Var.c(iO);
            float fO = yoi1.o(n511VarC.a, 0.0f, (int) (y9e1Var.c >> 32));
            boolean zQ = rpo1.q(n511Var3, fO, n511VarC.b);
            boolean zQ2 = rpo1.q(n511Var3, fO, n511VarC.d);
            boolean z6 = y9e1Var.a(iO) == 2;
            int i2 = (zQ || zQ2) ? 1 : 0;
            if (!zQ || !zQ2) {
                i2 |= 2;
            }
            if (z6) {
                i2 |= 4;
            }
            float f3 = n511VarC.b;
            float f4 = n511VarC.d;
            z = z4;
            builder = builder;
            builder.setInsertionMarkerLocation(fO, f3, f4, f4, i2);
        }
        if (z3) {
            int iG2 = nbe1Var != null ? nbe1.g(nbe1Var.a) : -1;
            int iF = nbe1Var != null ? nbe1.f(nbe1Var.a) : -1;
            if (iG2 >= 0 && iG2 < iF) {
                builder.setComposingText(iG2, c8e1Var.a.b.subSequence(iG2, iF));
                int iO2 = hyp0Var.o(iG2);
                int iO3 = hyp0Var.o(iF);
                float[] fArr2 = new float[(iO3 - iO2) * 4];
                y9e1Var.b.a(e6p1.e(iO2, iO3), fArr2);
                int i3 = iG2;
                while (i3 < iF) {
                    int iO4 = hyp0Var.o(i3);
                    int i4 = (iO4 - iO2) * 4;
                    float f5 = fArr2[i4];
                    float f6 = fArr2[i4 + 1];
                    float f7 = fArr2[i4 + 2];
                    float f8 = fArr2[i4 + 3];
                    int i5 = iF;
                    int i6 = (n511Var3.a < f7 ? 1 : 0) & (f5 < n511Var3.c ? 1 : 0) & (n511Var3.b < f8 ? 1 : 0) & (f6 < n511Var3.d ? 1 : 0);
                    if (!rpo1.q(n511Var3, f5, f6) || !rpo1.q(n511Var3, f7, f8)) {
                        i6 |= 2;
                    }
                    int i7 = i6;
                    if (y9e1Var.a(iO4) == 2) {
                        i = i7 | 4;
                        f = f8;
                    } else {
                        f = f8;
                        i = i7;
                    }
                    builder.addCharacterBounds(i3, f5, f6, f7, f, i);
                    i3++;
                    fArr2 = fArr2;
                    iF = i5;
                }
            }
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33 && z) {
            gg.M(builder, n511Var4);
        }
        if (i8 >= 34 && z5) {
            sf.c(builder, y9e1Var, n511Var3);
        }
        oj80Var.d().updateCursorAnchorInfo(view, builder.build());
        this.b = false;
    }

    public a0c0(ll4 ll4Var, oj80 oj80Var) {
        this.g = ll4Var;
        this.h = oj80Var;
        this.i = new Object();
        this.o = new CursorAnchorInfo.Builder();
        this.f7p = kch0.a();
        this.q = new Matrix();
    }
}
