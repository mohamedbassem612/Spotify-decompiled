package p;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class e3r0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ z7n0 b;
    public /* synthetic */ ioj0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ zl5 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3r0(String str, zl5 zl5Var, int i, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = str;
        this.e = zl5Var;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        z7n0 z7n0Var = (z7n0) obj;
        ioj0 ioj0Var = (ioj0) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                e3r0 e3r0Var = new e3r0(this.e, this.d, this.f, lnmVar, (byte) 0);
                e3r0Var.b = z7n0Var;
                e3r0Var.c = ioj0Var;
                return e3r0Var.invokeSuspend(rih1Var);
            case 1:
                e3r0 e3r0Var2 = new e3r0(this.d, this.e, this.f, lnmVar, (byte) 1);
                e3r0Var2.b = z7n0Var;
                e3r0Var2.c = ioj0Var;
                return e3r0Var2.invokeSuspend(rih1Var);
            case 2:
                e3r0 e3r0Var3 = new e3r0(this.d, this.e, this.f, lnmVar, (byte) 2);
                e3r0Var3.b = z7n0Var;
                e3r0Var3.c = ioj0Var;
                return e3r0Var3.invokeSuspend(rih1Var);
            default:
                e3r0 e3r0Var4 = new e3r0(this.e, this.d, this.f, lnmVar, (byte) 3);
                e3r0Var4.b = z7n0Var;
                e3r0Var4.c = ioj0Var;
                return e3r0Var4.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
    /* JADX WARN: Code duplicated, block: B:89:0x021e  */
    public final Object invokeSuspend(Object obj) {
        List listK0;
        List list;
        goj0 goj0VarA;
        List listK1;
        goj0 goj0VarA2;
        List listK2;
        goj0 goj0VarA3;
        jo70 jo70Var;
        goj0 goj0VarA4;
        hoj0 hoj0VarC;
        goj0 goj0VarA5;
        us6 us6Var;
        String str;
        byte b = this.a;
        int i = this.f;
        String str2 = this.d;
        zl5 zl5Var = this.e;
        us6 us6Var2 = null;
        List list2 = z6x.a;
        switch (b) {
            case 0:
                z7n0 z7n0Var = this.b;
                ioj0 ioj0Var = this.c;
                hm5.M(obj);
                if (!z7n0Var.a) {
                    return list2;
                }
                String str3 = this.d;
                hoj0 hoj0VarC2 = ioj0Var.c(us6.class, str3);
                if (hoj0VarC2 != null && (goj0VarA = hoj0VarC2.a()) != null) {
                    us6Var2 = (us6) goj0VarA.a;
                }
                zl5 zl5Var2 = this.e;
                if (((xf4) zl5Var2.i).u()) {
                    if (us6Var2 != null) {
                        listK0 = o7h.K0(o7h.N0(us6Var2.a, us6Var2.b), o7h.p1(us6Var2.c));
                        list = listK0;
                    } else {
                        list = list2;
                    }
                } else if (us6Var2 != null) {
                    listK0 = us6Var2.a;
                    list = listK0;
                } else {
                    list = list2;
                }
                if (list.isEmpty()) {
                    return list2;
                }
                return Collections.singletonList(zl5Var2.i(this.f, "video-preview-artist-page", str3, ((Context) zl5Var2.b).getString(2131959064), zl5Var2.x(str3), list, list.size() >= 10));
            case 1:
                z7n0 z7n0Var2 = this.b;
                ioj0 ioj0Var2 = this.c;
                hm5.M(obj);
                if (!z7n0Var2.a) {
                    return list2;
                }
                hoj0 hoj0VarC3 = ioj0Var2.c(us6.class, str2);
                us6 us6Var3 = (hoj0VarC3 == null || (goj0VarA2 = hoj0VarC3.a()) == null) ? null : (us6) goj0VarA2.a;
                if (((xf4) zl5Var.i).u()) {
                    if (us6Var3 != null) {
                        listK1 = o7h.K0(o7h.N0(us6Var3.a, us6Var3.b), o7h.p1(us6Var3.c));
                    } else {
                        listK1 = null;
                    }
                } else if (us6Var3 != null) {
                    listK1 = us6Var3.a;
                } else {
                    listK1 = null;
                }
                List list3 = listK1;
                if (list3 == null || list3.isEmpty()) {
                    return list2;
                }
                qfr0[] qfr0VarArr = new qfr0[2];
                int size = listK1.size();
                Context context = (Context) zl5Var.b;
                qfr0VarArr[0] = size >= 10 ? new gfr0(context.getString(2131959064), zl5Var.x(str2), new tfr0(new Integer(i), (y6h1) null, 2)) : new ffr0(context.getString(2131959064));
                qfr0VarArr[1] = new ofr0("video-preview-artist-page", o7h.d1(listK1, 10), new tfr0(new Integer(i), (y6h1) null, 2));
                return p7h.M(qfr0VarArr);
            case 2:
                z7n0 z7n0Var3 = this.b;
                ioj0 ioj0Var3 = this.c;
                hm5.M(obj);
                if (!z7n0Var3.a) {
                    return list2;
                }
                hoj0 hoj0VarC4 = ioj0Var3.c(ljh1.class, str2);
                ljh1 ljh1Var = (hoj0VarC4 == null || (goj0VarA4 = hoj0VarC4.a()) == null) ? null : (ljh1) goj0VarA4.a;
                hoj0 hoj0VarC5 = ioj0Var3.c(jo70.class, str2);
                String str4 = (hoj0VarC5 == null || (goj0VarA3 = hoj0VarC5.a()) == null || (jo70Var = (jo70) goj0VarA3.a) == null) ? null : jo70Var.a;
                if (((xf4) zl5Var.i).u()) {
                    if (ljh1Var != null) {
                        listK2 = o7h.K0(o7h.N0(ljh1Var.a, ljh1Var.c), o7h.p1(ljh1Var.b));
                    } else {
                        listK2 = list2;
                    }
                } else if (ljh1Var != null) {
                    listK2 = o7h.K0(ljh1Var.a, ljh1Var.b);
                } else {
                    listK2 = list2;
                }
                if (listK2.isEmpty()) {
                    return list2;
                }
                qfr0[] qfr0VarArr2 = new qfr0[2];
                int size2 = listK2.size();
                Context context2 = (Context) zl5Var.b;
                qfr0VarArr2[0] = size2 >= 10 ? new gfr0(context2.getString(2131963478, str4), "spotify:list:artist-music-videos:unmapped-".concat(ihc1.V0(str2, ':', str2)), new tfr0(new Integer(i), (y6h1) null, 2)) : new ffr0(context2.getString(2131963478, str4));
                qfr0VarArr2[1] = new ofr0("unmapped-video-preview-artist-page", o7h.d1(listK2, 10), new tfr0(new Integer(i), (y6h1) null, 2));
                return p7h.M(qfr0VarArr2);
            default:
                z7n0 z7n0Var4 = this.b;
                ioj0 ioj0Var4 = this.c;
                hm5.M(obj);
                return (!z7n0Var4.a || (hoj0VarC = ioj0Var4.c(us6.class, str2)) == null || (goj0VarA5 = hoj0VarC.a()) == null || (us6Var = (us6) goj0VarA5.a) == null || (str = (String) o7h.s0(us6Var.a)) == null) ? list2 : p7h.M(new qfr0[]{new ffr0(((Context) zl5Var.b).getString(2131959116)), new wer0(str2, str, new tfr0(Integer.valueOf(i), (y6h1) null, 2))});
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3r0(zl5 zl5Var, String str, int i, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = zl5Var;
        this.d = str;
        this.f = i;
    }
}
