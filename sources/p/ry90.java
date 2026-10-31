package p;

import android.os.Bundle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ry90 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry90(int i) {
        super(2);
        this.a = (byte) 26;
        j2i j2iVar = z1j.a;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0303  */
    /* JADX WARN: Code duplicated, block: B:149:0x030d  */
    /* JADX WARN: Code duplicated, block: B:151:0x0311  */
    /* JADX WARN: Code duplicated, block: B:152:0x031b  */
    public final Object invoke(Object obj, Object obj2) {
        int i;
        ArrayList arrayList;
        long jA;
        mq70 mq70Var;
        pp70 pp70Var;
        up70 up70VarA;
        xkk1 xkk1Var;
        up70 up70VarA2;
        String str;
        boolean z;
        Integer numC0;
        Integer numValueOf;
        Integer numValueOf2;
        Object obj3;
        String str2;
        xkk1 xkk1Var2;
        mq70 mq70Var2;
        up70 up70VarA3;
        ihm0 parcelable;
        byte b = this.a;
        vp70 vp70Var = vp70.c;
        boolean z2 = false;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                lmt0.g((b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                sgc1.r((b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                oqn1.e((b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                return v4b0.f((t4b0) u890.k((k1r) obj2, (d0r) null, (n4r) null), (g7e) obj);
            case 4:
                ((Number) obj2).intValue();
                xfo1.e((b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                rwd0 rwd0Var = (swd0) obj;
                zzd0 zzd0VarA = rwd0Var.a;
                String str3 = zzd0VarA.a.c;
                if (str3.length() <= 0 || !eto0.a.contains(str3)) {
                    return rwd0Var;
                }
                pwd0 pwd0Var = zzd0VarA.b;
                j3s0 j3s0Var = pwd0Var.b;
                j3s0 j3s0Var2 = j3s0Var instanceof j3s0 ? j3s0Var : null;
                if (j3s0Var2 != null && ((i = j3s0Var2.e) == 6 || i == 8)) {
                    arrayList = null;
                    zzd0VarA = zzd0.a(zzd0VarA, pwd0.a(pwd0Var, j3s0.a(j3s0Var2, 7, false, 47), (vkf) null, 13), false, (tle1) null, false, 32765);
                } else {
                    arrayList = null;
                }
                return rwd0.a(rwd0Var, zzd0VarA, arrayList, 6);
            case 6:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarR = u291.r(nim0.a, 49.0f);
                    cr31 cr31Var = er31.a;
                    qim0 qim0VarQ = i1p1.q(qim0VarR, cr31Var);
                    uwr uwrVar = cbx.a;
                    t1c.a(cwl1.l0(dug.f(qim0VarQ, cbx.a(x340Var2).a.b.a(), d4o1.a), 0L, cr31Var, 13), x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                t5p1.c((b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                b9p1.c((b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                b9p1.j((b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                fbp1.e((b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fbp1.e(x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                d9y0.d((b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ilg0 ilg0Var = (ilg0) obj;
                k1r k1rVar = (k1r) obj2;
                if ((k1rVar instanceof j1r) || (k1rVar instanceof h1r)) {
                    return new olg0(ilg0Var.c);
                }
                hlg0 hlg0Var = (hlg0) u890.k(k1rVar, (d0r) null, (n4r) null);
                String str4 = ilg0Var.a;
                jo70 jo70Var = hlg0Var.a;
                xkk1 xkk1Var3 = hlg0Var.d;
                i1r i1rVar = hlg0Var.b;
                String str5 = jo70Var.a;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                clg0 clg0Var = new clg0(str4, str5, (i1rVar2 == null || (xkk1Var = (xkk1) i1rVar2.a) == null || (up70VarA2 = xkk1Var.a.a(vp70Var)) == null) ? null : up70VarA2.a.a);
                clg0 clg0Var2 = new clg0(ilg0Var.b, hlg0Var.c.a, (xkk1Var3 == null || (up70VarA = xkk1Var3.a.a(vp70Var)) == null) ? null : up70VarA.a.a);
                z6a1 z6a1Var = hlg0Var.e;
                mmr0 mmr0Var = z6a1Var != null ? new mmr0(Integer.valueOf((int) z6a1Var.a), Integer.valueOf((int) z6a1Var.b)) : null;
                long j = ilg0Var.c;
                grn1 grn1Var = ilg0Var.d;
                boolean z3 = ilg0Var.e;
                boolean z4 = !(i1rVar instanceof j1r);
                if (xkk1Var3 == null || (mq70Var = xkk1Var3.a) == null || (pp70Var = mq70Var.b) == null) {
                    uwr uwrVar2 = cbx.a;
                    jA = ((yex) zex.a.d).e;
                } else {
                    jA = pp70Var.c.a.b.a();
                }
                return new nlg0(clg0Var, clg0Var2, grn1Var, z3, j, z4, jA, mmr0Var != null ? (Integer) mmr0Var.a : null, mmr0Var != null ? (Integer) mmr0Var.b : null, hlg0Var.f);
            case 14:
                fmg0 fmg0Var = (fmg0) obj;
                emg0 emg0Var = (emg0) obj2;
                jo70 jo70Var2 = emg0Var.a;
                z6a1 z6a1Var2 = emg0Var.c;
                i1r i1rVar3 = emg0Var.b;
                if (jo70Var2 == null || (str = jo70Var2.a) == null) {
                    str = fmg0Var.a;
                }
                String str6 = str;
                i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                String str7 = (i1rVar4 == null || (xkk1Var2 = (xkk1) i1rVar4.a) == null || (mq70Var2 = xkk1Var2.a) == null || (up70VarA3 = mq70Var2.a(vp70Var)) == null) ? null : up70VarA3.a.a;
                boolean z5 = !(i1rVar3 instanceof j1r);
                c380 c380Var = fmg0Var.c;
                String str8 = fmg0Var.b;
                String str9 = fmg0Var.d;
                boolean z6 = fmg0Var.h;
                long j2 = fmg0Var.f;
                long j3 = fmg0Var.g;
                Function0 function0 = fmg0Var.i;
                String str10 = fmg0Var.e;
                List list = emg0Var.d;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            z = z6;
                            Iterator it2 = it;
                            if (u890.j(((pvc0) next).c, fmg0Var.e)) {
                                obj3 = next;
                            } else {
                                it = it2;
                                z6 = z;
                            }
                        } else {
                            z = z6;
                            obj3 = null;
                        }
                    }
                    pvc0 pvc0Var = (pvc0) obj3;
                    if (pvc0Var != null && (str2 = (String) pvc0Var.f.get("record_count")) != null) {
                        numC0 = nhc1.c0(str2);
                    }
                    Integer num = numC0;
                    if (z6a1Var2 != null) {
                        numValueOf = Integer.valueOf((int) z6a1Var2.a);
                    } else {
                        numValueOf = null;
                    }
                    if (z6a1Var2 != null) {
                        numValueOf2 = Integer.valueOf((int) z6a1Var2.b);
                    } else {
                        numValueOf2 = null;
                    }
                    return new gmg0(str8, str6, str7, z5, c380Var, str9, str10, num, j2, j3, z, function0, numValueOf, numValueOf2, emg0Var.e);
                }
                z = z6;
                numC0 = null;
                Integer num2 = numC0;
                if (z6a1Var2 != null) {
                    numValueOf = Integer.valueOf((int) z6a1Var2.a);
                } else {
                    numValueOf = null;
                }
                if (z6a1Var2 != null) {
                    numValueOf2 = Integer.valueOf((int) z6a1Var2.b);
                } else {
                    numValueOf2 = null;
                }
                return new gmg0(str8, str6, str7, z5, c380Var, str9, str10, num2, j2, j3, z, function0, numValueOf, numValueOf2, emg0Var.e);
            case 15:
                ((Number) obj2).intValue();
                rrn1.e((b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                return nm1.k((List) obj2, (pfj1) obj);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                PlayerState playerState = (PlayerState) obj;
                PlayerState playerState2 = (PlayerState) obj2;
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                String strB0 = contextTrack != null ? l4o1.b0(contextTrack) : "";
                ContextTrack contextTrack2 = (ContextTrack) playerState2.track().h();
                if (strB0.equals(contextTrack2 != null ? l4o1.b0(contextTrack2) : "")) {
                    ContextTrack contextTrack3 = (ContextTrack) playerState.track().h();
                    String strA0 = contextTrack3 != null ? l4o1.a0(contextTrack3, "image_url") : null;
                    ContextTrack contextTrack4 = (ContextTrack) playerState2.track().h();
                    if (u890.j(strA0, contextTrack4 != null ? l4o1.a0(contextTrack4, "image_url") : null)) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ContextTrack contextTrack5 = (ContextTrack) obj;
                ContextTrack contextTrack6 = (ContextTrack) obj2;
                if (u890.j(contextTrack5 != null ? l4o1.b0(contextTrack5) : null, contextTrack6 != null ? l4o1.b0(contextTrack6) : null)) {
                    if (u890.j(contextTrack5 != null ? l4o1.a0(contextTrack5, "image_url") : null, contextTrack6 != null ? l4o1.a0(contextTrack6, "image_url") : null)) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((Number) obj2).intValue();
                fqo1.o((b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                two1.f((b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((Number) obj2).intValue();
                gyo1.i((b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                gyo1.j((b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                gyo1.s((b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                fmj0 fmj0Var = (fmj0) obj;
                z810 z810Var = (z810) obj2;
                fju fjuVar = fmj0Var.b;
                boolean z7 = fjuVar.b && !(fjuVar.a && z810Var.a);
                fy50 fy50Var = z810Var.b;
                return new gmj0(lmj0.f(new gd91(z7, fy50Var instanceof fy50 ? fy50Var : null, z810Var.d, z810Var.c, z810Var.j, true, z810Var.e, z810Var.f, z810Var.g, z810Var.h, fjuVar.d, fjuVar.i && z810Var.k, z810Var.l, z810Var.m, z810Var.n, z810Var.o, z810Var.f53p), fmj0Var));
            case 25:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    z1j.a.invoke(x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                j2i j2iVar = z1j.a;
                u2p1.f((b0k) obj, czo1.p(7));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                t3p1.b((b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                ro7 ro7Var = (ro7) obj;
                ro7 ro7Var2 = (ro7) obj2;
                Double dValueOf = Double.valueOf(ro7Var.a);
                String str11 = ro7Var.d.a;
                if (ihc1.y0(str11)) {
                    str11 = null;
                }
                zkk0 zkk0Var = new zkk0(dValueOf, str11);
                Double dValueOf2 = Double.valueOf(ro7Var2.a);
                String str12 = ro7Var2.d.a;
                return new mmr0(zkk0Var, new zkk0(dValueOf2, !ihc1.y0(str12) ? str12 : null));
            default:
                Bundle bundle = (Bundle) obj2;
                return (bundle == null || (parcelable = bundle.getParcelable(l7m0.class.getName())) == null) ? new ihm0("", (String) obj, false) : parcelable;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ry90(byte b, int i, boolean z) {
        super(i);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ry90(int i, byte b) {
        super(2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ry90(Object obj, byte b) {
        super(2);
        this.a = b;
    }
}
