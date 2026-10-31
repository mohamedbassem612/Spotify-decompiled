package p;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.Restrictions;
import com.spotify.scrollsita.v1.Section;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yd81 extends hab0 implements vu30 {
    public static final yd81 N0;
    public static final yd81 O0;
    public static final yd81 P0;
    public static final yd81 Q0;
    public static final yd81 R0;
    public static final yd81 S0;
    public static final yd81 T0;
    public static final yd81 U0;
    public static final yd81 V0;
    public static final yd81 W0;
    public static final yd81 X;
    public static final yd81 X0;
    public static final yd81 Y;
    public static final yd81 Y0;
    public static final yd81 Z;
    public static final yd81 Z0;
    public static final yd81 a1;
    public static final yd81 b;
    public static final yd81 b1;
    public static final yd81 c;
    public static final yd81 c1;
    public static final yd81 d;
    public static final yd81 d1;
    public static final yd81 e;
    public static final yd81 e1;
    public static final yd81 f;
    public static final yd81 g;
    public static final yd81 h;
    public static final yd81 i;
    public static final yd81 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new yd81(i2, (byte) 0);
        c = new yd81(i2, (byte) 1);
        d = new yd81(i2, (byte) 2);
        e = new yd81(i2, (byte) 3);
        f = new yd81(i2, (byte) 4);
        g = new yd81(i2, (byte) 5);
        h = new yd81(i2, (byte) 6);
        i = new yd81(i2, (byte) 7);
        t = new yd81(i2, (byte) 8);
        X = new yd81(i2, (byte) 9);
        Y = new yd81(i2, (byte) 10);
        Z = new yd81(i2, (byte) 11);
        N0 = new yd81(i2, (byte) 12);
        O0 = new yd81(i2, (byte) 13);
        P0 = new yd81(i2, (byte) 14);
        Q0 = new yd81(i2, (byte) 15);
        R0 = new yd81(i2, (byte) 16);
        S0 = new yd81(i2, (byte) 17);
        T0 = new yd81(i2, (byte) 18);
        U0 = new yd81(i2, (byte) 19);
        V0 = new yd81(i2, (byte) 20);
        W0 = new yd81(i2, (byte) 21);
        X0 = new yd81(i2, (byte) 22);
        Y0 = new yd81(i2, (byte) 23);
        Z0 = new yd81(i2, (byte) 24);
        a1 = new yd81(i2, (byte) 25);
        b1 = new yd81(i2, (byte) 26);
        c1 = new yd81(i2, (byte) 27);
        d1 = new yd81(i2, (byte) 28);
        e1 = new yd81(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd81(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        String str;
        u7h u7hVar;
        long jC;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                ud81 ud81Var = (ud81) obj;
                return new vd81(ud81Var.c, ud81Var.a, ud81Var.b, !((Boolean) obj2).booleanValue());
            case 1:
                return ((ic81) obj).b;
            case 2:
                qxl0 qxl0Var = (qxl0) obj;
                int i2 = ((pe81) re81.e.get(((qxm0) obj2).a)).e;
                z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                mmr0 mmr0Var = new mmr0("setting_name", "selected_shuffle_algorithm");
                if (i2 == 1) {
                    str = "classic";
                } else {
                    if (i2 != 2) {
                        throw null;
                    }
                    str = "fewer_repeats";
                }
                return new w7h1("", "", z7h1Var, new x7h1("set_multiple_choice_setting", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("option_selected", str)})), qxl0Var.a, qxl0Var.b.c.b, System.currentTimeMillis());
            case 3:
                return ((pe81) re81.e.get(((Number) obj2).intValue())).a.a;
            case 4:
                ue81 ue81Var = (ue81) obj2;
                int iOrdinal = ue81Var.a.ordinal();
                u7h u7hVar2 = we81.a;
                if (iOrdinal == 0) {
                    u7hVar = u7hVar2;
                } else if (iOrdinal == 1) {
                    u7hVar = we81.b;
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    u7hVar = we81.c;
                }
                boolean z = ue81Var.c;
                u7h u7hVar3 = z ? null : u7hVar;
                if (u7hVar3 != null) {
                    u7hVar2 = u7hVar3;
                }
                return new xe81(u7hVar2, ue81Var.b, z);
            case 5:
                return (cg81) obj2;
            case 6:
                Object objT = jhc1.t((Bundle) obj, "parcelable", cg81.class);
                objT.getClass();
                return (Parcelable) objT;
            case 7:
                return new ci81((bi81) obj, (fi81) obj2);
            case 8:
                ixx ixxVar = ((afx) obj).a.a;
                int iOrdinal2 = ((vux) obj2).ordinal();
                if (iOrdinal2 == 0) {
                    jC = ixxVar.c();
                } else if (iOrdinal2 == 1) {
                    jC = ixxVar.b();
                } else {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    jC = ixxVar.c();
                }
                return new u7h(jC);
            case 9:
                Bundle bundle = (Bundle) obj;
                zi81 zi81Var = (zi81) obj2;
                String string = bundle.getString("username");
                Uri uri = (Uri) jhc1.t(bundle, "imageUri", Uri.class);
                String string2 = bundle.getString("displayName");
                int i3 = bundle.getInt("backgroundColor");
                Integer numValueOf = Integer.valueOf(i3);
                if (i3 == 0) {
                    numValueOf = null;
                }
                return new aj81(string, uri, string2, numValueOf != null ? new u7h(z4p1.e(numValueOf.intValue())) : null, zi81Var.a, 32);
            case 10:
                ((p3x) obj).c = ((s3v) obj2).a;
                return rih1Var;
            case 11:
                ((p3x) obj).d = (x291) obj2;
                return rih1Var;
            case 12:
                l591 l591Var = (l591) obj2;
                return l591Var != null ? p7h.M(new String[]{l591Var.a, l591Var.b.name()}) : z6x.a;
            case 13:
                yvg1 yvg1Var = (yvg1) obj2;
                String str2 = (String) yvg1Var.a;
                t380 t380Var = (t380) yvg1Var.b;
                fvf1 fvf1Var = (fvf1) yvg1Var.c;
                str2.getClass();
                return new l691(str2, t380Var.isEmpty() || t380Var.equals(Collections.singleton("mft_disallow")), fvf1Var);
            case 14:
                yvg1 yvg1Var2 = (yvg1) obj2;
                String str3 = (String) yvg1Var2.a;
                Restrictions restrictions = (Restrictions) yvg1Var2.b;
                return new t691(str3, restrictions.disallowSkippingPrevReasons().isEmpty() || restrictions.disallowSeekingReasons().isEmpty(), (fvf1) yvg1Var2.c);
            case 15:
                return Boolean.valueOf(u890.j(((ContextTrack) obj).uri(), ((ContextTrack) obj2).uri()));
            case 16:
                return (d891) obj2;
            case 17:
                mmr0 mmr0Var2 = (mmr0) obj2;
                return new p991((String) mmr0Var2.a, ((Boolean) mmr0Var2.b).booleanValue());
            case 18:
                bm91 bm91Var = (bm91) obj2;
                return new om91(((fm91) obj).a, bm91Var.a, bm91Var.b, bm91Var.c, 1, bm91Var.d, true, bm91Var.e);
            case 19:
                return Next.j();
            case 20:
                return First.b(z011.a((z011) obj2, ((ko91) obj).a, false, (Map) null, 100));
            case 21:
                return null;
            case 22:
                return null;
            case 23:
                return new u7h(((afx) obj).a.c);
            case 24:
                return new q6a1((jo70) obj, ((f7a1) obj2).a);
            case 25:
                return new i7a1(((h7a1) obj).a, (Map) obj2);
            case 26:
                return new u7h(u7h.j);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                uwr uwrVar = cbx.a;
                return new u7h(((vex) zex.a.e).b);
            case 28:
                return new g8a1(((Boolean) obj2).booleanValue(), ((f8a1) obj).b);
            default:
                return qxd0.U(((mic1) obj).f, (op80) obj2);
        }
    }
}
