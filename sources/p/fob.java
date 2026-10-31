package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fob implements tyq {
    public final /* synthetic */ byte a = 1;
    public final d0r b;
    public final boolean c;
    public final o3r d;
    public final psw e;
    public final Object f;
    public final Object g;
    public final mqw h;
    public final rqw i;

    public fob(d0r d0rVar, String str, kmj1 kmj1Var, vbs vbsVar) {
        this.b = d0rVar;
        this.f = str;
        this.g = kmj1Var;
        this.c = vbsVar.g;
        imj1 imj1VarB = kmj1.b(new deb1(this, (byte) 3));
        l4r l4rVar = new l4r(pwc0.r, 2, rdb1.i, new j4r(rdb1.e), rdb1.t);
        jd11 jd11Var = rc11.a;
        this.d = w3p1.i(l4rVar, new l4r(new wlu(jd11Var.b(xkk1.class)), 2, rdb1.X, new j4r(rdb1.f), rdb1.Y), new l4r(new wlu(jd11Var.b(hll.class)), 2, rdb1.Z, new j4r(rdb1.g), rdb1.N0), imj1VarB.a, imj1VarB.b, new l4r(new wlu(jd11Var.b(mtl.class)), 2, rdb1.O0, new j4r(new deb1(this, (byte) 1)), rdb1.P0), new l4r(jd0.h, 2, rdb1.Q0, new j4r(new deb1(this, (byte) 2)), rdb1.h), new nuj(this, (byte) 1));
        this.h = x3p1.n(new deb1(this, (byte) 0), rdb1.d, new t491(this, (byte) 14), (o8n) null, (iu30) null, 24);
        this.i = new eih1();
        j2i j2iVar = new j2i(1760374841, new u491(this, (byte) 24), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public static ydb1 h(ceb1 ceb1Var) {
        mq70 mq70Var;
        up70 up70VarA;
        String str;
        xkk1 xkk1Var = ceb1Var.a;
        if (xkk1Var == null || (mq70Var = xkk1Var.b) == null || (up70VarA = mq70Var.a(vp70.c)) == null || (str = up70VarA.a.a) == null) {
            return null;
        }
        return new ydb1(str);
    }

    public static zdb1 i(ceb1 ceb1Var) {
        mq70 mq70Var;
        up70 up70VarA;
        xkk1 xkk1Var = ceb1Var.a;
        String str = (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null) ? null : up70VarA.a.a;
        if (str == null) {
            str = "";
        }
        return new zdb1(str);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.i;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }

    public final d0r e() {
        byte b = this.a;
        return this.b;
    }

    public void f(aeb1 aeb1Var, hux huxVar, b0k b0kVar, int i) {
        int i2;
        ecx ecxVarD;
        String strConcat;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1771746181);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? x340Var.g(aeb1Var) : x340Var.i(aeb1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = aeb1Var instanceof zdb1;
            if (z) {
                cbx.a.getClass();
                ecxVarD = uwr.a();
            } else if (!(aeb1Var instanceof ydb1)) {
                eg.o();
                return;
            } else {
                cbx.a.getClass();
                ecxVarD = uwr.d();
            }
            ecx ecxVar = ecxVarD;
            Uri uri = Uri.parse(aeb1Var.getUri());
            as80 as80Var = mif1.P0;
            String uri2 = aeb1Var.getUri();
            String str = z ? "square" : "sixteen_by_nine";
            if (uri2.length() == 0) {
                strConcat = "standard_row_media_" + str + "_placeholder_" + huxVar;
            } else {
                strConcat = "standard_row_media_".concat(str);
            }
            qim0 qim0VarN = anm1.N(strConcat, nim0.a);
            fwx fwxVarG = hso1.G(huxVar, 0L, 0L, x340Var, 8 | ((i2 >> 3) & 14), 30);
            eso1.e(uri, isl.a, qim0VarN, (p3v) null, (zvx) null, ecxVar, as80Var, (tl3) null, (ColorFilter) null, new pux(fwxVarG, fwxVarG), false, false, x340Var, 1073744944, 0, 3472);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new um81(this, aeb1Var, huxVar, i, (byte) 5);
        }
    }

    public void g(aeb1 aeb1Var, boolean z, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2088846671);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(aeb1Var) : x340Var.i(aeb1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (z) {
            x340Var.i0(-949654976);
            f(aeb1Var, znx.c, x340Var, (i2 & 896) | (i2 & 14) | (znx.d << 3));
            x340Var.r(false);
        } else {
            x340Var.i0(-949566719);
            f(aeb1Var, ltx.c, x340Var, (i2 & 896) | (i2 & 14) | (ltx.d << 3));
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mi81(this, aeb1Var, z, i);
        }
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.h;
    }

    public final f4r getData() {
        switch (this.a) {
            case 0:
                return (f4r) this.g;
            default:
                return this.d;
        }
    }

    public fob(d0r d0rVar, boolean z, lzn0 lzn0Var) {
        i13 mchVar;
        ia00 eih1Var;
        this.b = d0rVar;
        this.c = z;
        this.f = lzn0Var;
        jd11 jd11Var = rc11.a;
        o3r o3rVarN = w3p1.n(new l4r(new xv00(jd11Var.b(zc8.class)), 1, zmb.Y0, new j4r(zmb.U0), zmb.Z0), new l4r(new xv00(jd11Var.b(jo70.class)), 2, zmb.W0, new j4r(zmb.V0), zmb.X0), wnb.c);
        this.d = o3rVarN;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h4r(zmb.T0, o3rVarN));
        if (arrayList.isEmpty()) {
            mchVar = i13.j;
        } else {
            mchVar = arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        }
        this.g = mchVar;
        this.h = h7w.B(zmb.S0, (o8n) null, (iu30) null, new hp9(this, (byte) 12), 6);
        if (z) {
            eih1Var = n3o1.q(this).a(s1b.X, s1b.Y);
        } else {
            eih1Var = new eih1();
        }
        this.i = eih1Var;
        j2i j2iVar = q9i.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }
}
