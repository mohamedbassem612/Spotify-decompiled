package p;

import com.spotify.gander.v2.proto.SecondaryAction;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Icon;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.IconName;
import com.spotify.pendragon.v1.proto.Signifier;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import com.spotify.yourupdates.domain.models.State;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class emv0 implements iu30 {
    public final /* synthetic */ byte a;

    public kgc1 a(yfc1 yfc1Var) {
        egc1 egc1Var;
        zfc1 zfc1Var = yfc1Var.b;
        boolean zB = yfc1Var.b();
        if (yfc1Var.c == 1) {
            egc1Var = new egc1(pob.h(zfc1Var), zfc1Var == zfc1.a ? rwa.i : new swa(pob.g(zfc1Var)));
        } else {
            egc1Var = dgc1.b;
        }
        return new kgc1(zB, egc1Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    public final Object invoke(Object obj) {
        byte b = this.a;
        Enum r5 = null;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                cn81 cn81Var = (cn81) obj;
                q8a0 q8a0Var = fmv0.b;
                cn81Var.a("java/lang/Object", q8a0Var);
                q8a0 q8a0Var2 = fmv0.c;
                cn81Var.a("java/lang/Object", q8a0Var2);
                q8a0 q8a0Var3 = fmv0.a;
                cn81Var.a("java/util/function/BiFunction", q8a0Var, q8a0Var2, q8a0Var2, q8a0Var3);
                cn81Var.b("java/lang/Object", q8a0Var3);
                return rih1Var;
            case 1:
                cn81 cn81Var2 = (cn81) obj;
                q8a0 q8a0Var4 = fmv0.b;
                cn81Var2.a("java/lang/Object", q8a0Var4);
                cn81Var2.a("java/lang/Object", q8a0Var4);
                cn81Var2.b("java/lang/Object", fmv0.a);
                return rih1Var;
            case 2:
                cn81 cn81Var3 = (cn81) obj;
                q8a0 q8a0Var5 = fmv0.b;
                cn81Var3.a("java/util/function/Predicate", q8a0Var5, q8a0Var5);
                cn81Var3.c = new mmr0(nja0.e.c, (Object) null);
                return rih1Var;
            case 3:
                cn81 cn81Var4 = (cn81) obj;
                q8a0 q8a0Var6 = fmv0.b;
                cn81Var4.a("java/lang/Object", q8a0Var6);
                cn81Var4.a("java/lang/Object", q8a0Var6);
                cn81Var4.b("java/lang/Object", fmv0.a);
                return rih1Var;
            case 4:
                ((cn81) obj).b("java/util/Optional", fmv0.b, fmv0.c);
                return rih1Var;
            case 5:
                cn81 cn81Var5 = (cn81) obj;
                q8a0 q8a0Var7 = fmv0.c;
                cn81Var5.a("java/lang/Object", q8a0Var7);
                cn81Var5.b("java/util/Optional", fmv0.b, q8a0Var7);
                return rih1Var;
            case 6:
                cn81 cn81Var6 = (cn81) obj;
                cn81Var6.a("java/lang/Object", fmv0.a);
                cn81Var6.b("java/util/Optional", fmv0.b, fmv0.c);
                return rih1Var;
            case 7:
                ((cn81) obj).b("java/lang/Object", fmv0.c);
                return rih1Var;
            case 8:
                ((cn81) obj).a("java/util/function/Consumer", fmv0.b, fmv0.c);
                return rih1Var;
            case 9:
                ((cn81) obj).b("java/lang/Object", fmv0.a);
                return rih1Var;
            case 10:
                cn81 cn81Var7 = (cn81) obj;
                cn81Var7.a("java/lang/Object", fmv0.b);
                cn81Var7.c = new mmr0(nja0.e.c, (Object) null);
                return rih1Var;
            case 11:
                cn81 cn81Var8 = (cn81) obj;
                q8a0 q8a0Var8 = fmv0.b;
                cn81Var8.a("java/lang/Object", q8a0Var8);
                cn81Var8.a("java/lang/Object", q8a0Var8);
                cn81Var8.c = new mmr0(nja0.e.c, (Object) null);
                return rih1Var;
            case 12:
                ((cn81) obj).a("java/lang/Object", fmv0.b);
                return rih1Var;
            case 13:
                q8a0 q8a0Var9 = fmv0.b;
                ((cn81) obj).b("java/util/stream/Stream", q8a0Var9, q8a0Var9);
                return rih1Var;
            case 14:
                cn81 cn81Var9 = (cn81) obj;
                q8a0 q8a0Var10 = fmv0.b;
                cn81Var9.a("java/lang/Object", q8a0Var10);
                cn81Var9.a("java/lang/Object", q8a0Var10);
                return rih1Var;
            case 15:
                cn81 cn81Var10 = (cn81) obj;
                q8a0 q8a0Var11 = fmv0.b;
                cn81Var10.a("java/lang/Object", q8a0Var11);
                cn81Var10.b("java/lang/Object", q8a0Var11);
                return rih1Var;
            case 16:
                cn81 cn81Var11 = (cn81) obj;
                q8a0 q8a0Var12 = fmv0.b;
                cn81Var11.a("java/lang/Object", q8a0Var12);
                cn81Var11.a("java/lang/Object", q8a0Var12);
                cn81Var11.b("java/lang/Object", q8a0Var12);
                return rih1Var;
            case 17:
                ((cn81) obj).b("java/lang/Object", fmv0.b);
                return rih1Var;
            case 18:
                q8a0 q8a0Var13 = fmv0.b;
                ((cn81) obj).b("java/util/stream/Stream", q8a0Var13, q8a0Var13);
                return rih1Var;
            case 19:
                q8a0 q8a0Var14 = fmv0.b;
                ((cn81) obj).a("java/util/function/UnaryOperator", q8a0Var14, q8a0Var14);
                return rih1Var;
            case 20:
                ((cn81) obj).a("java/lang/Object", fmv0.b);
                return rih1Var;
            case 21:
                ((cn81) obj).a("java/lang/Object", fmv0.b);
                return rih1Var;
            case 22:
                ((cn81) obj).b("java/lang/Object", fmv0.b);
                return rih1Var;
            case 23:
                ((cn81) obj).b("java/lang/Object", fmv0.b);
                return rih1Var;
            case 24:
                throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + ((Number) obj).intValue() + '.');
            case 25:
                throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + ((Number) obj).intValue() + '.');
            case 26:
                SecondaryAction secondaryAction = (SecondaryAction) obj;
                int iN = secondaryAction.n();
                int i = iN == 0 ? -1 : je51.a[l1d.C(iN)];
                if (i == 1) {
                    return new de51(secondaryAction.p().getUsername(), secondaryAction.p().o());
                }
                if (i == 2) {
                    return new vd51(secondaryAction.o().getUsername(), secondaryAction.o().o());
                }
                if (i == 3) {
                    return new he51(secondaryAction.q().getPlaylistUri());
                }
                if (i != 4) {
                    return null;
                }
                return new ae51();
            case 27:
                Signifier signifier = (Signifier) obj;
                String strName = signifier.p().q().name();
                Enum r0 = IconName.ICON_UNKNOWN;
                for (Enum r4 : IconName.values()) {
                    if (u890.j(r4.name(), strName)) {
                        r5 = r4;
                        if (r5 != null) {
                            r0 = r5;
                        }
                        return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier(new Icon(r0, ihc1.e1(signifier.p().o()).toString()), signifier.q(), ihc1.e1(signifier.r()).toString());
                    }
                }
                if (r5 != null) {
                    r0 = r5;
                }
                return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier(new Icon(r0, ihc1.e1(signifier.p().o()).toString()), signifier.q(), ihc1.e1(signifier.r()).toString());
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return oth1.valueOf(((State) obj).name());
            default:
                return a((yfc1) obj);
        }
    }

    public emv0(pob pobVar) {
        this.a = (byte) 29;
    }
}
