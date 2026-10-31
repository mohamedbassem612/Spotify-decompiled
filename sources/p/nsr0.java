package p;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nsr0 implements h0r0 {
    public final los a;
    public final e2b0 b;
    public final ov20 c;
    public final hvj d;
    public final kly0 e;
    public final kly0 f;
    public final poj0 g;
    public final cbr0 h;

    public nsr0(los losVar, e2b0 e2b0Var, ov20 ov20Var, hvj hvjVar, ywp ywpVar, ywp ywpVar2, poj0 poj0Var) {
        this.a = losVar;
        this.b = e2b0Var;
        this.c = ov20Var;
        this.d = hvjVar;
        this.e = ywpVar;
        this.f = ywpVar2;
        this.g = poj0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.h = new cbr0(new dbr0[]{new bn70(yon1.G1("PARENTAL_CONTROL_PARENT_DETAILS", "parental-control/parent-details", 1415, "parental-control"), nik1.X6, (nar0) null), new t1r0(true), new kce0(), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, true, (nsm0) null, 3805)}, false);
    }

    public final cbr0 a() {
        return this.h;
    }

    public final p2r0 b() {
        return this.d.a(new o6e0(new oxa0(this, null, (byte) 24), f46.I(new p6e0[0])), new j2i(-2046600483, new n1r0(this, (byte) 5), true), new xvj((xu30) null, (j2i) null, (j2i) null, false, 63));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(onm onmVar) {
        msr0 msr0Var;
        String str;
        String str2;
        Uri uri;
        Uri uri2;
        mdg0 mdg0Var;
        tho1 tho1Var;
        Object objI;
        mdg0 mdg0Var2;
        tho1 tho1Var2;
        String str3;
        if (onmVar instanceof msr0) {
            msr0Var = (msr0) onmVar;
            int i = msr0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                msr0Var.g = i - Integer.MIN_VALUE;
            } else {
                msr0Var = new msr0(this, onmVar);
            }
        } else {
            msr0Var = new msr0(this, onmVar);
        }
        Object objI2 = msr0Var.e;
        int i2 = msr0Var.g;
        bw20 bw20Var = this.c;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objI2);
            mr20 mr20VarA = bw20Var.a("show-linked-parent-in-settings", false);
            msr0Var.g = 1;
            objI2 = b5p1.i(mr20VarA, msr0Var);
            if (objI2 != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            hm5.M(objI2);
        } else {
            if (i2 == 2) {
                hm5.M(objI2);
                ctr0 ctr0Var = (ctr0) objI2;
                cww0 cww0Var = ctr0Var.b;
                str = cww0Var.a;
                str2 = cww0Var.b;
                if (str2 != null || (uri = Uri.parse(str2)) == null) {
                    uri = Uri.EMPTY;
                }
                uri2 = uri;
                uri2.getClass();
                mdg0Var = ctr0Var.a;
                tho1Var = ctr0Var.c;
                mr20 mr20VarA2 = bw20Var.a("has-audiobooks-subscription", false);
                msr0Var.a = str;
                msr0Var.b = uri2;
                msr0Var.c = mdg0Var;
                msr0Var.d = tho1Var;
                msr0Var.g = 3;
                objI = b5p1.i(mr20VarA2, msr0Var);
                if (objI != d9nVar) {
                    mdg0Var2 = mdg0Var;
                    tho1Var2 = tho1Var;
                    objI2 = objI;
                    str3 = str;
                }
                return d9nVar;
            }
            if (i2 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tho1 tho1Var3 = msr0Var.d;
            mdg0 mdg0Var3 = msr0Var.c;
            uri2 = msr0Var.b;
            String str4 = msr0Var.a;
            hm5.M(objI2);
            tho1Var2 = tho1Var3;
            str3 = str4;
            mdg0Var2 = mdg0Var3;
        }
        return new rsr0(str3, uri2, mdg0Var2, tho1Var2, ((Boolean) objI2).booleanValue());
        if (!((Boolean) objI2).booleanValue()) {
            eg.m("Current account is not eligible to view linked parent details");
            return null;
        }
        msr0Var.g = 2;
        objI2 = this.b.d(msr0Var);
        if (objI2 != d9nVar) {
            ctr0 ctr0Var2 = (ctr0) objI2;
            cww0 cww0Var2 = ctr0Var2.b;
            str = cww0Var2.a;
            str2 = cww0Var2.b;
            if (str2 != null) {
                uri = Uri.EMPTY;
            } else {
                uri = Uri.EMPTY;
            }
            uri2 = uri;
            uri2.getClass();
            mdg0Var = ctr0Var2.a;
            tho1Var = ctr0Var2.c;
            mr20 mr20VarA3 = bw20Var.a("has-audiobooks-subscription", false);
            msr0Var.a = str;
            msr0Var.b = uri2;
            msr0Var.c = mdg0Var;
            msr0Var.d = tho1Var;
            msr0Var.g = 3;
            objI = b5p1.i(mr20VarA3, msr0Var);
            if (objI != d9nVar) {
                mdg0Var2 = mdg0Var;
                tho1Var2 = tho1Var;
                objI2 = objI;
                str3 = str;
                return new rsr0(str3, uri2, mdg0Var2, tho1Var2, ((Boolean) objI2).booleanValue());
            }
        }
        return d9nVar;
    }
}
