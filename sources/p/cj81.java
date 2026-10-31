package p;

import android.os.Bundle;
import com.spotify.player.model.ContextTrack;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cj81 extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj81(ven0 ven0Var, ecd1 ecd1Var, lnm lnmVar) {
        super(4, lnmVar);
        this.a = (byte) 3;
        this.c = ven0Var;
        this.d = ecd1Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        byte b2 = 4;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                cj81 cj81Var = new cj81((maa) this.d, (lnm) obj4, (byte) 0);
                cj81Var.b = (vi81) obj2;
                cj81Var.c = (tqw) obj3;
                cj81Var.invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                cj81 cj81Var2 = new cj81((int) b2, (lnm) obj4, (byte) 1);
                cj81Var2.b = (p7a1) obj;
                cj81Var2.c = (List) obj2;
                cj81Var2.d = (List) obj3;
                return cj81Var2.invokeSuspend(rih1Var);
            case 2:
                cj81 cj81Var3 = new cj81((maa) this.d, (lnm) obj4, (byte) 2);
                cj81Var3.b = (mxb1) obj;
                cj81Var3.c = (lxb1) obj2;
                cj81Var3.invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                cj81 cj81Var4 = new cj81((ven0) this.c, (ecd1) this.d, (lnm) obj4);
                cj81Var4.b = (n10) obj2;
                cj81Var4.invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                cj81 cj81Var5 = new cj81(b2, (lnm) obj4, b2);
                cj81Var5.b = (uof1) obj;
                cj81Var5.c = (ContextTrack) obj2;
                cj81Var5.d = (Boolean) obj3;
                return cj81Var5.invokeSuspend(rih1Var);
            default:
                cj81 cj81Var6 = new cj81((int) b2, (lnm) obj4, (byte) 5);
                cj81Var6.b = (b5m1) obj;
                cj81Var6.c = (czl1) obj2;
                cj81Var6.d = (j3c) obj3;
                return cj81Var6.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                vi81 vi81Var = (vi81) this.b;
                tqw tqwVar = (tqw) this.c;
                hm5.M(obj);
                if (vi81Var != null) {
                    ((lzn0) ((res) this.d).d).a("spotify:user", cvl1.d(tqwVar), (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 1:
                p7a1 p7a1Var = (p7a1) this.b;
                List list = (List) this.c;
                List list2 = (List) this.d;
                hm5.M(obj);
                return new o7a1(p7a1Var, list.size(), list2);
            case 2:
                mxb1 mxb1Var = (mxb1) this.b;
                lxb1 lxb1Var = (lxb1) this.c;
                hm5.M(obj);
                if (!(lxb1Var instanceof kxb1)) {
                    if (lxb1Var instanceof jxb1) {
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                nxb1 nxb1Var = (nxb1) o7h.t0(((kxb1) lxb1Var).a, mxb1Var.a);
                if (nxb1Var == null) {
                    return rih1Var;
                }
                ((pxb1) this.d).b.invoke(nxb1Var);
                return rih1Var;
            case 3:
                n10 n10Var = (n10) this.b;
                hm5.M(obj);
                ven0 ven0Var = (ven0) this.c;
                f811 f811VarR = mue1.R((nue1) ven0Var.getValue(), n10Var);
                List<kiw> list3 = f811VarR.b;
                nue1 nue1Var = f811VarR.a;
                if (nue1Var != ((nue1) ven0Var.getValue())) {
                    ven0Var.setValue(nue1Var);
                }
                if (list3.isEmpty()) {
                    return rih1Var;
                }
                ecd1 ecd1Var = (ecd1) this.d;
                for (kiw kiwVar : list3) {
                    mhg0 mhg0Var = (mhg0) ecd1Var.c;
                    if (kiwVar instanceof kaw) {
                        mhg0Var.invoke(vte1.a);
                    } else if (kiwVar instanceof jaw) {
                        mhg0Var.invoke(ute1.a);
                    } else if (kiwVar instanceof zew) {
                        mhg0Var.invoke(new zte1(((zew) kiwVar).a));
                    } else if (kiwVar instanceof kew) {
                        mhg0Var.invoke(yte1.a);
                    } else if (kiwVar instanceof jew) {
                        mhg0Var.invoke(new wte1(((jew) kiwVar).a));
                    } else {
                        if (!(kiwVar instanceof lew)) {
                            eg.o();
                            return null;
                        }
                        mhg0Var.invoke(new xte1(((lew) kiwVar).a));
                    }
                }
                return rih1Var;
            case 4:
                uof1 uof1Var = (uof1) this.b;
                ContextTrack contextTrack = (ContextTrack) this.c;
                Boolean bool = (Boolean) this.d;
                hm5.M(obj);
                contextTrack.getClass();
                bool.getClass();
                return new iof1(contextTrack, uof1Var, bool.booleanValue());
            default:
                b5m1 b5m1Var = (b5m1) this.b;
                czl1 czl1Var = (czl1) this.c;
                j3c j3cVar = (j3c) this.d;
                hm5.M(obj);
                return new d5m1(czl1Var.a, czl1Var.b, new b5m1(b5m1Var.a, b5m1Var.b, j3cVar, b5m1Var.d), true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cj81(maa maaVar, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.d = maaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cj81(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
