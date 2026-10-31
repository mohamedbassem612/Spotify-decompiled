package p;

import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionStatus;
import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.EncoreFont;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.IconName;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.pendragon.v1.proto.Icon;
import com.spotify.pendragon.v1.proto.Text;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ryq implements iu30 {
    public final /* synthetic */ byte a;

    public /* synthetic */ ryq(byte b) {
        this.a = b;
    }

    public static l3p1 d(DataSectionStatus dataSectionStatus, int i) {
        if (u890.j(dataSectionStatus, e2r.a)) {
            return j2r.c;
        }
        if (u890.j(dataSectionStatus, f2r.a)) {
            return j2r.d;
        }
        if (dataSectionStatus instanceof d2r) {
            return new i2r(((d2r) dataSectionStatus).a, i);
        }
        if (!(dataSectionStatus instanceof c2r)) {
            eg.o();
            return null;
        }
        c2r c2rVar = (c2r) dataSectionStatus;
        return new h2r(c2rVar.a, c2rVar.b, c2rVar.c);
    }

    public pyq a(ayq ayqVar) {
        g2r g2rVar;
        List list = ayqVar.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                List listA1 = o7h.a1(arrayList, new p0d(this, (byte) 20));
                boolean z2 = ayqVar.b;
                boolean z3 = ayqVar.c;
                if ((list instanceof Collection) && list.isEmpty()) {
                    z = false;
                } else {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (u890.j(((b2r) it2.next()).b, e2r.a)) {
                            if (ayqVar.d) {
                                break;
                            }
                        }
                    }
                    z = false;
                }
                return new pyq(listA1, z2, z3, z, ayqVar.d, ayqVar.e, ayqVar.f);
            }
            b2r b2rVar = (b2r) it.next();
            DataSectionType dataSectionType = b2rVar.a;
            DataSectionStatus dataSectionStatus = b2rVar.b;
            int i = qyq.a[dataSectionType.ordinal()];
            if (i == 1) {
                g2rVar = new g2r(2131954799, 2131954797, 2131954798, 5, d(dataSectionStatus, 5), DataSectionType.ACCOUNT_DATA);
            } else if (i == 2) {
                g2rVar = new g2r(2131954810, 2131954808, 2131954809, 30, d(dataSectionStatus, 30), DataSectionType.EXTENDED_STREAMING_HISTORY);
            } else {
                if (i != 3) {
                    eg.o();
                    return null;
                }
                g2rVar = new g2r(2131954828, 2131954826, 2131954827, 30, d(dataSectionStatus, 30), DataSectionType.TECHNICAL_LOG_INFORMATION);
            }
            arrayList.add(g2rVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01e9  */
    public final Object invoke(Object obj) {
        byte b = this.a;
        z = false;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        boolean z2 = false;
        int i = 1;
        EncoreFont encoreFont = null;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return a((ayq) obj);
            case 1:
                ttm1 ttm1Var = ((bhy) obj).b;
                if (u890.j(ttm1.i.get(ttm1Var.e), tlb.class)) {
                    EncoreFont encoreFont2 = ttm1Var.g;
                    if (encoreFont2 == null) {
                        bhn0.i("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.BookExtraInfo");
                        return null;
                    }
                    encoreFont = (tlb) encoreFont2;
                }
                int i2 = encoreFont != null ? encoreFont.d : 0;
                long j = encoreFont != null ? encoreFont.e : 0L;
                int i3 = encoreFont != null ? encoreFont.b : 0;
                int i4 = i3 == 0 ? -1 : wis.a[l1d.C(i3)];
                if (i4 != 1) {
                    i = 2;
                    if (i4 != 2) {
                        i = 3;
                        if (i4 != 3) {
                            i = 4;
                        }
                    }
                }
                return new fgx0(i2, j, i);
            case 2:
                return mka1.m0;
            case 3:
                tr3 tr3Var = (tr3) obj;
                w7c0 w7c0Var = tr3Var.c;
                sxc0 sxc0Var = tr3Var.b;
                qn90 qn90Var = sxc0Var.c;
                if ((((qn90Var instanceof b8e0) || (qn90Var instanceof on90) || (qn90Var instanceof pn90)) ? true : qn90Var instanceof qn90 ? qn90Var.a instanceof b8e0 : false) && w7c0Var.a(x9v0.a) != null && w7c0Var.a(kf90.a) != null && (sxc0Var.c instanceof on90)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 4:
                Icon icon = (Icon) obj;
                String strName = icon.q().name();
                EncoreFont encoreFont3 = IconName.ICON_UNKNOWN;
                for (EncoreFont encoreFont4 : IconName.values()) {
                    if (u890.j(encoreFont4.name(), strName)) {
                        encoreFont = encoreFont4;
                        if (encoreFont != null) {
                            encoreFont3 = encoreFont;
                        }
                        return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Icon(encoreFont3, ihc1.e1(icon.o()).toString());
                    }
                }
                if (encoreFont != null) {
                    encoreFont3 = encoreFont;
                }
                return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Icon(encoreFont3, ihc1.e1(icon.o()).toString());
            case 5:
                jyc jycVar = (jyc) obj;
                if (jycVar.getKind() == 1) {
                    beg begVar = (beg) jycVar.k();
                    String str = j8a0.a;
                    if (j8a0.j.containsKey(iht.f(begVar))) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 6:
                return ((roe0) obj).b.invoke();
            case 7:
                Text text = (Text) obj;
                return new MessageText(text.p(), text.q(), text.r() ? EncoreFont.valueOf(text.o().name()) : null);
            case 8:
                return (jyc) obj;
            case 9:
                return (jyc) obj;
            case 10:
                q8a0 q8a0Var = fmv0.b;
                ((cn81) obj).a("java/util/function/Consumer", q8a0Var, q8a0Var);
                return rih1Var;
            case 11:
                ((cn81) obj).a("java/lang/Object", fmv0.b);
                return rih1Var;
            case 12:
                ((cn81) obj).a("java/lang/Object", fmv0.b);
                return rih1Var;
            case 13:
                ((cn81) obj).b("java/lang/Object", fmv0.b);
                return rih1Var;
            case 14:
                ((cn81) obj).b("java/lang/Object", fmv0.b);
                return rih1Var;
            case 15:
                ((cn81) obj).a("java/lang/Object", fmv0.b);
                return rih1Var;
            case 16:
                ((cn81) obj).a("java/lang/Object", fmv0.b);
                return rih1Var;
            case 17:
                ((cn81) obj).b("java/lang/Object", fmv0.b);
                return rih1Var;
            case 18:
                ((cn81) obj).b("java/lang/Object", fmv0.b);
                return rih1Var;
            case 19:
                ((cn81) obj).b("java/lang/Object", fmv0.b);
                return rih1Var;
            case 20:
                ((cn81) obj).b("java/lang/Object", fmv0.b);
                return rih1Var;
            case 21:
                q8a0 q8a0Var2 = fmv0.b;
                ((cn81) obj).b("java/util/Spliterator", q8a0Var2, q8a0Var2);
                return rih1Var;
            case 22:
                q8a0 q8a0Var3 = fmv0.b;
                ((cn81) obj).a("java/util/function/BiConsumer", q8a0Var3, q8a0Var3, q8a0Var3);
                return rih1Var;
            case 23:
                cn81 cn81Var = (cn81) obj;
                q8a0 q8a0Var4 = fmv0.b;
                cn81Var.a("java/lang/Object", q8a0Var4);
                cn81Var.a("java/lang/Object", q8a0Var4);
                cn81Var.b("java/lang/Object", fmv0.a);
                return rih1Var;
            case 24:
                cn81 cn81Var2 = (cn81) obj;
                q8a0 q8a0Var5 = fmv0.b;
                cn81Var2.a("java/lang/Object", q8a0Var5);
                cn81Var2.a("java/lang/Object", q8a0Var5);
                cn81Var2.b("java/lang/Object", fmv0.a);
                return rih1Var;
            case 25:
                cn81 cn81Var3 = (cn81) obj;
                q8a0 q8a0Var6 = fmv0.b;
                cn81Var3.a("java/lang/Object", q8a0Var6);
                cn81Var3.a("java/lang/Object", q8a0Var6);
                cn81Var3.a("java/lang/Object", q8a0Var6);
                cn81Var3.c = new mmr0(nja0.e.c, (Object) null);
                return rih1Var;
            case 26:
                q8a0 q8a0Var7 = fmv0.b;
                ((cn81) obj).a("java/util/function/BiFunction", q8a0Var7, q8a0Var7, q8a0Var7, q8a0Var7);
                return rih1Var;
            case 27:
                cn81 cn81Var4 = (cn81) obj;
                q8a0 q8a0Var8 = fmv0.b;
                cn81Var4.a("java/lang/Object", q8a0Var8);
                q8a0 q8a0Var9 = fmv0.a;
                cn81Var4.a("java/util/function/BiFunction", q8a0Var8, q8a0Var8, q8a0Var9, q8a0Var9);
                cn81Var4.b("java/lang/Object", q8a0Var9);
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                cn81 cn81Var5 = (cn81) obj;
                q8a0 q8a0Var10 = fmv0.b;
                cn81Var5.a("java/lang/Object", q8a0Var10);
                cn81Var5.a("java/util/function/Function", q8a0Var10, q8a0Var10, q8a0Var10);
                cn81Var5.b("java/lang/Object", q8a0Var10);
                return rih1Var;
            default:
                cn81 cn81Var6 = (cn81) obj;
                q8a0 q8a0Var11 = fmv0.b;
                cn81Var6.a("java/lang/Object", q8a0Var11);
                q8a0 q8a0Var12 = fmv0.c;
                q8a0 q8a0Var13 = fmv0.a;
                cn81Var6.a("java/util/function/BiFunction", q8a0Var11, q8a0Var11, q8a0Var12, q8a0Var13);
                cn81Var6.b("java/lang/Object", q8a0Var13);
                return rih1Var;
        }
    }

    public /* synthetic */ ryq(Object obj, byte b) {
        this.a = b;
    }
}
