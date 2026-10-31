package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.media3.exoplayer.ExoPlayer;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mj10 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj10(byte b, boolean z) {
        super(1);
        this.a = b;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    public final Object invoke(Object obj) {
        Object obj2;
        boolean z;
        boolean z2;
        byte b = this.a;
        int i = 0;
        rih1 rih1Var = rih1.a;
        boolean z3 = this.b;
        switch (b) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                if (z3) {
                    DrawScope.d0(drawScope, u7h.b(u7h.b, 0.72f, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 126);
                } else {
                    DrawScope.S0(drawScope, v9c.s(p7h.M(new u7h[]{new u7h(u7h.j), new u7h(u7h.b)}), Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) * 0.2f, Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) * 0.9f, 8), 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
                }
                return rih1Var;
            case 1:
                e261 e261Var = (e261) obj;
                b261.c(e261Var);
                if (z3) {
                    b261.t(e261Var, 0);
                }
                return rih1Var;
            case 2:
                ((kd31) obj).b(z3 ? 0.0f : 1.0f);
                return rih1Var;
            case 3:
                xa5 xa5Var = (xa5) obj;
                c391 c391Var = new c391(false, bp30.P0);
                return z3 ? xa5Var.a(hm5.P(bby.b, xay.f(2, irn1.o0(300, 0, (dlv) null, 6))), c391Var) : xa5Var.a(hm5.P(bby.b, xay.f(2, irn1.j0())), c391Var);
            case 4:
                b261.y((e261) obj, z3);
                return rih1Var;
            case 5:
                e261 e261Var2 = (e261) obj;
                b261.x(e261Var2, 1);
                b261.E(e261Var2, z3 ? rze1.a : rze1.b);
                return rih1Var;
            case 6:
                String str = (String) obj;
                if (z3) {
                    return str;
                }
                return null;
            case 7:
                b261.y((e261) obj, z3);
                return rih1Var;
            case 8:
                b261.y((e261) obj, z3);
                return rih1Var;
            case 9:
                ((ExoPlayer) obj).setRepeatMode(z3 ? 2 : 0);
                return rih1Var;
            case 10:
                DrawScope drawScope2 = (DrawScope) obj;
                if (z3) {
                    DrawScope.d0(drawScope2, u7h.b(u7h.b, 0.7f, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 126);
                } else {
                    DrawScope.S0(drawScope2, v9c.s(p7h.M(new u7h[]{new u7h(u7h.j), new u7h(u7h.b)}), Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L)) * 0.2f, Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L)) * 0.9f, 8), 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
                }
                return rih1Var;
            case 11:
                rtb0.b((rtb0) obj, 4, (iu30) null, new j2i(37740038, new spf((byte) 1, z3), true), 6);
                return rih1Var;
            case 12:
                e261 e261Var3 = (e261) obj;
                b261.x(e261Var3, 3);
                b261.y(e261Var3, z3);
                return rih1Var;
            case 13:
                b261.y((e261) obj, z3);
                return rih1Var;
            case 14:
                return ((dnl0) obj).e(z3 ? 2 : 1, z3 ? 1 : 2);
            case 15:
                enl0 enl0Var = (enl0) obj;
                char c = z3 ? (char) 2 : (char) 1;
                char c2 = z3 ? (char) 1 : (char) 2;
                z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                String str2 = "off";
                if (c == 1) {
                    obj2 = "off";
                } else {
                    if (c != 2) {
                        throw null;
                    }
                    obj2 = "on";
                }
                mmr0 mmr0Var = new mmr0("state_before_toggle", obj2);
                if (c2 != 1) {
                    if (c2 != 2) {
                        throw null;
                    }
                    str2 = "on";
                }
                return new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str2)})), enl0Var.a, enl0Var.b.b, System.currentTimeMillis());
            case 16:
                cbm0 cbm0Var = cbm0.a;
                return x12.a(cbm0.b(z3), sqg0.J(new mmr0[]{new mmr0("street", "1600 Pennsylvania Avenue"), new mmr0("city", "Washington"), new mmr0("state", "DC"), new mmr0("zip", "20500")}));
            case 17:
                b261.y((e261) obj, z3);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new lo51(z3);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((kd31) obj).b(z3 ? 1.0f : 0.38f);
                return rih1Var;
            case 20:
                e261 e261Var4 = (e261) obj;
                b261.y(e261Var4, z3);
                b261.x(e261Var4, 3);
                return rih1Var;
            case 21:
                b261.y((e261) obj, z3);
                return rih1Var;
            case 22:
                String str3 = ((um01) obj).b;
                if (!z3) {
                    return null;
                }
                if (sgy.i(str3) || sgy.d(str3)) {
                    return str3;
                }
                return null;
            case 23:
                rtb0.b((rtb0) obj, 5, jt01.S0, new j2i(1470912287, new spf((byte) 3, z3), true), 4);
                return rih1Var;
            case 24:
                e261 e261Var5 = (e261) obj;
                b261.x(e261Var5, 4);
                b261.y(e261Var5, z3);
                return rih1Var;
            case 25:
                ((kd31) obj).p(z3 ? 15.0f : -15.0f);
                return rih1Var;
            case 26:
                ((kd31) obj).p(z3 ? -15.0f : 15.0f);
                return rih1Var;
            case 27:
                e261 e261Var6 = (e261) obj;
                b261.x(e261Var6, 4);
                b261.y(e261Var6, z3);
                return rih1Var;
            case 28:
                rtb0 rtb0Var = (rtb0) obj;
                ArrayList arrayList = new ArrayList(3);
                while (true) {
                    sae1 sae1Var = sae1.a;
                    if (i >= 3) {
                        ArrayList arrayListO0 = o7h.O0(sae1Var, q7h.V(arrayList));
                        rtb0.b(rtb0Var, arrayListO0.size(), (iu30) null, new j2i(-388203481, new i301(arrayListO0, z3, (byte) 1), true), 6);
                        return rih1Var;
                    }
                    arrayList.add(p7h.M(new sae1[]{sae1Var, sae1.b}));
                    i++;
                }
                break;
            default:
                nyf1 nyf1Var = (nyf1) obj;
                boolean z4 = nyf1Var.i;
                j9k1 j9k1Var = nyf1Var.h;
                gql gqlVar = gql.b;
                boolean zEquals = j9k1Var.equals(gqlVar);
                boolean z5 = !zEquals;
                boolean z6 = (zEquals || z4) ? false : true;
                boolean z7 = (!o0c.j(nyf1Var.a, nyf1Var.x, z5) || nyf1Var.u || nyf1Var.n) ? false : true;
                String str4 = nyf1Var.b;
                String str5 = nyf1Var.c;
                String str6 = nyf1Var.d;
                String str7 = ((j9k1Var instanceof eql) || (j9k1Var instanceof dql) || z4) ? null : nyf1Var.e;
                k4m k4mVarP = oqn1.p(nyf1Var.g);
                int i2 = nyf1Var.j;
                boolean z8 = nyf1Var.i;
                boolean z9 = !z8;
                boolean z10 = nyf1Var.l;
                if (!nyf1Var.y || z8) {
                    z = false;
                } else {
                    if (j9k1Var.equals(dql.b) || j9k1Var.equals(eql.b)) {
                        z2 = false;
                    } else {
                        if (!j9k1Var.equals(fql.b) && !j9k1Var.equals(gqlVar)) {
                            eg.o();
                            return null;
                        }
                        z2 = nyf1Var.f;
                    }
                    if (z2) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                return new qzf1(str4, str5, str6, str7, k4mVarP, i2, z6, z8, z9, z10, z, nyf1Var.k, z7, nyf1Var.m && z3, nyf1Var.n, nyf1Var.f46p, nyf1Var.o, nyf1Var.r, nyf1Var.s, nyf1Var.t, nyf1Var.u, nyf1Var.w);
        }
    }
}
