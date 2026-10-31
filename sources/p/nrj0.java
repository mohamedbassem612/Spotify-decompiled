package p;

import android.graphics.BlurMaskFilter;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nrj0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nrj0(byte b) {
        super(1);
        this.a = b;
    }

    public final Object invoke(Object obj) throws Exception {
        zuc0 zuc0Var;
        tu00 tu00Var;
        jo70 jo70VarA;
        io70 io70Var;
        List listSingletonList;
        e17 k07Var;
        byte b = this.a;
        String str = null;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return (uov0) orj0.b(System.getProperty("ro.odm.csc.spotify.music.referrerid"), new fki0((String) obj, (byte) 6));
            case 1:
                return Boolean.valueOf(((a5j0) ((mmr0) obj).b) instanceof z4j0);
            case 2:
                a5j0 a5j0Var = (a5j0) ((mmr0) obj).b;
                if (!(a5j0Var instanceof y4j0) && !(a5j0Var instanceof x4j0)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                return Boolean.valueOf(((a5j0) ((mmr0) obj).b) instanceof z4j0);
            case 4:
                Object obj2 = ((mmr0) obj).b;
                a5j0 a5j0Var2 = (a5j0) obj2;
                return Boolean.valueOf((!(a5j0Var2 instanceof y4j0) && !(a5j0Var2 instanceof x4j0)) || (((a5j0) obj2) instanceof x4j0));
            case 5:
                return ((dnl0) obj).e(2, 1);
            case 6:
                return ((dnl0) obj).e(2, 1);
            case 7:
                Bundle bundle = new Bundle();
                bundle.putParcelable(l7m0.class.getName(), (ihm0) obj);
                return bundle;
            case 8:
                return new k2n0(((hwq) obj).g.getUri());
            case 9:
                l7e0 l7e0Var = ((hwq) obj).g;
                return new u2n0(l7e0Var.a(), l7e0Var.getUri());
            case 10:
                l7e0 l7e0Var2 = ((hwq) obj).g;
                String uri = l7e0Var2.getUri();
                j7e0 j7e0Var = l7e0Var2 instanceof j7e0 ? (j7e0) l7e0Var2 : null;
                if (j7e0Var != null && (zuc0Var = j7e0Var.a) != null && (tu00Var = zuc0Var.q) != null && (jo70VarA = tu00Var.a(jo70.class)) != null && (io70Var = jo70VarA.e) != null) {
                    str = io70Var.b;
                }
                return new h4n0(uri, str != null ? str : "");
            case 11:
                l7e0 l7e0Var3 = ((hwq) obj).g;
                return new o4n0(l7e0Var3.a(), l7e0Var3.getUri());
            case 12:
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                return rih1Var;
            case 13:
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                return rih1Var;
            case 14:
                pxo0 pxo0Var = (pxo0) obj;
                k5n0 k5n0Var = pxo0Var.e;
                String str2 = pxo0Var.a;
                if (k5n0Var instanceof j5n0) {
                    return Collections.singleton(str2);
                }
                if (k5n0Var instanceof k5n0) {
                    k5n0 k5n0Var2 = k5n0Var;
                    return f46.S0(new String[]{k5n0Var2.a, k5n0Var2.b});
                }
                if (k5n0Var instanceof i5n0) {
                    return f46.S0(new String[]{str2, ((i5n0) k5n0Var).b});
                }
                eg.o();
                return null;
            case 15:
                return mno1.h(new mmr0[]{new mmr0("entity.share.card.quiz", (Parcelable) obj)});
            case 16:
                return (Parcelable) jhc1.t((Bundle) obj, "entity.share.card.quiz", h7n0.class);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                tvj tvjVar = ((hnn0) ((xa5) obj).b()).b;
                int i = vnn0.X;
                for (vnn0 vnn0Var : z561.c0(sbn0.U0, tvjVar)) {
                }
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                eqc eqcVar = (eqc) obj;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)))) << 32);
                uwr uwrVar = cbx.a;
                long j = ((vex) zex.a.e).d;
                z1a1 z1a1VarA = er31.b(8.0f).a(jFloatToRawIntBits, eqcVar.a.getLayoutDirection(), eqcVar);
                lw4 lw4VarL = fdg1.l();
                lw4VarL.c(j);
                lw4VarL.a.setMaskFilter(new BlurMaskFilter(eqcVar.h() * 20.0f, BlurMaskFilter.Blur.NORMAL));
                return eqcVar.a(new ja5(eqcVar.h() * 4.0f, z1a1VarA, lw4VarL, (byte) 6));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ft40 ft40Var = (ft40) obj;
                return Boolean.valueOf((ft40Var instanceof iy9) || (ft40Var instanceof q60));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new zau0(((Boolean) obj).booleanValue());
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                e261 e261Var = (e261) obj;
                b261.x(e261Var, 2);
                b261.E(e261Var, rze1.a);
                return rih1Var;
            case 22:
                d441 d441VarG1 = ((y341) obj).g1("SELECT * FROM OfflineLicenseInfoEntity");
                try {
                    int iW = y7y0.w(d441VarG1, "media_id");
                    int iW2 = y7y0.w(d441VarG1, "key_set_id");
                    ArrayList arrayList = new ArrayList();
                    while (d441VarG1.f1()) {
                        arrayList.add(new ctp0(d441VarG1.P0(iW), d441VarG1.P0(iW2)));
                    }
                    d441VarG1.close();
                    return arrayList;
                } catch (Throwable th) {
                    d441VarG1.close();
                    throw th;
                }
            case 23:
                fvp0 fvp0Var = (fvp0) obj;
                String str3 = fvp0Var.b;
                String str4 = fvp0Var.c;
                List list = fvp0Var.d;
                int i2 = fvp0Var.g;
                if (list.isEmpty()) {
                    listSingletonList = Collections.singletonList(new e17(bs0.g("")));
                } else {
                    List<String> list2 = list;
                    ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                    for (String str5 : list2) {
                        int iC = l1d.C(i2);
                        if (iC == 0) {
                            k07Var = new k07(bs0.g(str5), false);
                        } else if (iC == 6) {
                            k07Var = new y07(bs0.g(str5), false);
                        } else if (iC != 2) {
                            k07Var = iC != 3 ? new e17(bs0.g(str5)) : new t07(bs0.g(str5), false);
                        } else {
                            k07Var = new o07(bs0.g(str5));
                        }
                        arrayList2.add(k07Var);
                    }
                    listSingletonList = arrayList2;
                }
                return new qup0(str3, str4, listSingletonList, fvp0Var.e, fvp0Var.g, fvp0Var.h, fvp0Var.i, fvp0Var.j, fvp0Var.k);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((zyp0) obj).i = false;
                return rih1Var;
            case 25:
                ((sp21) obj).u = gtv0.k();
                return rih1Var;
            case 26:
                return rc2.K((p0q0) obj);
            case 27:
                j1q0 j1q0Var = (j1q0) obj;
                String strC = j1q0Var.c();
                Set set = s4b1.f;
                v5b1 v5b1Var = uic.x(strC).d;
                if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                    return new rxc0(j1q0Var.c());
                }
                return null;
            case 28:
                hi hiVar = (hi) obj;
                emq0 emq0VarD = fmq0.d(hiVar);
                return new qcr(hiVar, new mj(2131963046, 2131963035, 2131963041, 1, "https://spotify-tap.spotifycdn.com/onboarding/generic/Earbuds_Spotify_Tap.json", emq0VarD != null ? emq0VarD.a : "OPPO"), 1);
            default:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                DrawScope.b0(lslVar, u7h.j, 0.0f, 0L, 0.0f, new phc1(lslVar.X0(2.0f), 0.0f, 0, 0, (uw4) null, 30), 46);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nrj0(int i, byte b) {
        super(i);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nrj0(Object obj, byte b) {
        super(1);
        this.a = b;
    }
}
