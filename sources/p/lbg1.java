package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.automix.proto.TransitionOuterClass;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lbg1 extends hab0 implements vu30 {
    public static final lbg1 N0;
    public static final lbg1 O0;
    public static final lbg1 P0;
    public static final lbg1 Q0;
    public static final lbg1 R0;
    public static final lbg1 S0;
    public static final lbg1 T0;
    public static final lbg1 U0;
    public static final lbg1 V0;
    public static final lbg1 W0;
    public static final lbg1 X;
    public static final lbg1 X0;
    public static final lbg1 Y;
    public static final lbg1 Y0;
    public static final lbg1 Z;
    public static final lbg1 Z0;
    public static final lbg1 a1;
    public static final lbg1 b;
    public static final lbg1 b1;
    public static final lbg1 c;
    public static final lbg1 c1;
    public static final lbg1 d;
    public static final lbg1 d1;
    public static final lbg1 e;
    public static final lbg1 e1;
    public static final lbg1 f;
    public static final lbg1 g;
    public static final lbg1 h;
    public static final lbg1 i;
    public static final lbg1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new lbg1(i2, (byte) 0);
        c = new lbg1(i2, (byte) 1);
        d = new lbg1(i2, (byte) 2);
        e = new lbg1(i2, (byte) 3);
        f = new lbg1(i2, (byte) 4);
        g = new lbg1(i2, (byte) 5);
        h = new lbg1(i2, (byte) 6);
        i = new lbg1(i2, (byte) 7);
        t = new lbg1(i2, (byte) 8);
        X = new lbg1(i2, (byte) 9);
        Y = new lbg1(i2, (byte) 10);
        Z = new lbg1(i2, (byte) 11);
        N0 = new lbg1(i2, (byte) 12);
        O0 = new lbg1(i2, (byte) 13);
        P0 = new lbg1(i2, (byte) 14);
        Q0 = new lbg1(i2, (byte) 15);
        R0 = new lbg1(i2, (byte) 16);
        S0 = new lbg1(i2, (byte) 17);
        T0 = new lbg1(i2, (byte) 18);
        U0 = new lbg1(i2, (byte) 19);
        V0 = new lbg1(i2, (byte) 20);
        W0 = new lbg1(i2, (byte) 21);
        X0 = new lbg1(i2, (byte) 22);
        Y0 = new lbg1(i2, (byte) 23);
        Z0 = new lbg1(i2, (byte) 24);
        a1 = new lbg1(i2, (byte) 25);
        b1 = new lbg1(i2, (byte) 26);
        c1 = new lbg1(i2, (byte) 27);
        d1 = new lbg1(i2, (byte) 28);
        e1 = new lbg1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lbg1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        gkg1 gkg1Var;
        mq70 mq70Var;
        up70 up70VarA;
        boolean z = true;
        String str = null;
        switch (this.a) {
            case 0:
                return null;
            case 1:
                Object objT = jhc1.t((Bundle) obj, "parcelable", wcg1.class);
                objT.getClass();
                return (Parcelable) objT;
            case 2:
                Object objT2 = jhc1.t((Bundle) obj, "parcelable", xdg1.class);
                objT2.getClass();
                return (Parcelable) objT2;
            case 3:
                return null;
            case 4:
                ekg1 ekg1Var = (ekg1) obj;
                tjg1 tjg1VarQ = TransitionOuterClass.BlockSequence.q();
                List<ekc1> list = ((x6b) obj2).a;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (ekc1 ekc1Var : list) {
                    fkg1 fkg1VarR = TransitionOuterClass.StyleBlock.r();
                    int iC = l1d.C(ekc1Var.a);
                    if (iC == 0) {
                        gkg1Var = gkg1.c;
                    } else if (iC == 1) {
                        gkg1Var = gkg1.d;
                    } else {
                        if (iC != 2) {
                            eg.o();
                            return null;
                        }
                        gkg1Var = gkg1.e;
                    }
                    fkg1VarR.s(gkg1Var);
                    fkg1VarR.n(ekc1Var.b);
                    fkg1VarR.r(ekc1Var.c);
                    fkg1VarR.q(ekc1Var.d);
                    arrayList.add(fkg1VarR.build());
                }
                tjg1VarQ.n(arrayList);
                ekg1Var.A(tjg1VarQ.build());
                return ekg1Var;
            case 5:
                pkg1 pkg1Var = (pkg1) obj2;
                bdk0 bdk0Var = pkg1Var.b;
                if (!(bdk0Var instanceof zck0) && !(bdk0Var instanceof yck0)) {
                    z = false;
                }
                qkg1 qkg1Var = pkg1Var.a;
                return new okg1(qkg1Var.a, qkg1Var.b, z);
            case 6:
                return new lqg1((kqg1) obj);
            case 7:
                rqg1 rqg1Var = (rqg1) obj2;
                return new qqg1(rqg1Var.a, rqg1Var.b, ((pqg1) obj).b);
            case 8:
                return new mmr0((vnb1) obj, (h2v) obj2);
            case 9:
                sqg1 sqg1Var = (sqg1) obj;
                boolean z2 = sqg1Var.c;
                boolean z3 = sqg1Var.d;
                String str2 = sqg1Var.b;
                smc0 smc0VarN = k4p1.n();
                smc0VarN.add(new de60(2131963386));
                if (sqg1Var.a) {
                    smc0VarN.add(new de60(2131963389));
                }
                smc0VarN.add(new de60(2131963391));
                if (z3 && z2) {
                    smc0VarN.add(new de60(2131963390));
                }
                if (z3 && z2) {
                    smc0VarN.add(new de60(2131963387));
                }
                return new ghm0(str2, k4p1.k(smc0VarN));
            case 10:
                return Boolean.TRUE;
            case 11:
                e4h1 e4h1Var = (e4h1) obj2;
                return p7h.M(new Integer[]{Integer.valueOf(((rr80) e4h1Var.a()).a), Integer.valueOf(((rr80) e4h1Var.a()).b)});
            case 12:
                return null;
            case 13:
                return new u7h(((afx) obj).a.b.a());
            case 14:
                return new u7h(((afx) obj).b.d);
            case 15:
                return new u7h(((afx) obj).c.d);
            case 16:
                return new bgh1((a331) obj, ((bgh1) obj2).b);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return Next.j();
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((Number) obj).intValue();
                return ((zmh1) obj2).a;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return zso1.c0(((nfr0) obj).b, (op80) obj2);
            case 22:
                return zso1.c0(((nfr0) obj).b, (op80) obj2);
            case 23:
                tph1 tph1Var = (tph1) obj;
                return new uph1(tph1Var.a, tph1Var.b, tph1Var.c);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                uqo uqoVar = (uqo) obj;
                qxw qxwVar = (qxw) obj2;
                String str3 = qxwVar.a;
                if (str3 == null || ihc1.y0(str3)) {
                    str3 = null;
                }
                return new yqh1(uqoVar, str3, !qxwVar.c ? new gax(2131961839, (String) null) : iax.a);
            case 25:
                return Next.j();
            case 26:
                return (sru) obj2;
            case 27:
                return Next.h((o7i1) obj2);
            case 28:
                return First.b((o7i1) obj2);
            default:
                jo70 jo70Var = (jo70) obj;
                xkk1 xkk1Var = (xkk1) obj2;
                String str4 = jo70Var != null ? jo70Var.a : null;
                if (xkk1Var != null && (mq70Var = xkk1Var.a) != null && (up70VarA = mq70Var.a(vp70.c)) != null) {
                    str = up70VarA.a.a;
                }
                return new zn7(str, str4);
        }
    }
}
