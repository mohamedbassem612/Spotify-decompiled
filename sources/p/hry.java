package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hry extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yqg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hry(yqg yqgVar, byte b) {
        super(2);
        this.a = b;
        this.b = yqgVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        String strA0;
        byte b = this.a;
        boolean z = false;
        yqg yqgVar = this.b;
        Long lD0 = null;
        switch (b) {
            case 0:
                sry sryVar = (sry) obj;
                pla1 pla1Var = (rla1) obj2;
                if (pla1Var instanceof pla1) {
                    return new h3r(new d3r(pla1Var.a.toString()));
                }
                if (!(pla1Var instanceof qla1)) {
                    eg.o();
                    return null;
                }
                PlayerState playerState = (PlayerState) ((qla1) pla1Var).a;
                int i = jry.b;
                String str = sryVar.b;
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                if (contextTrack != null && l4o1.U(contextTrack) && l4o1.a0(contextTrack, "pointer.uri") != null) {
                    z = true;
                }
                int i2 = z ? 1 : 2;
                int i3 = (!z ? !(contextTrack == null || !o4p1.o(playerState).equals(sryVar.a)) : o4p1.o(playerState).equals(str) || u890.j(l4o1.a0(contextTrack, "pointer.uri"), str)) ? 1 : (playerState.isBuffering() || !playerState.isPlaying() || playerState.isPaused()) ? 2 : 3;
                Long l = (Long) playerState.position(yqgVar.b()).h();
                long jLongValue = l != null ? l.longValue() : 0L;
                boolean zIsBuffering = playerState.isBuffering();
                if (contextTrack != null && (strA0 = l4o1.a0(contextTrack, "media.start_position_creator_timestamp")) != null) {
                    lD0 = nhc1.d0(10, strA0);
                }
                return new j3r(new rry(i2, i3, jLongValue, zIsBuffering, lD0));
            default:
                qtf0 qtf0Var = (qtf0) obj;
                glm1 glm1Var = (glm1) obj2;
                String str2 = qtf0Var.a;
                if (glm1Var.equals(ykm1.a)) {
                    return Next.a(Collections.singleton(tkm1.a));
                }
                if (glm1Var.equals(dlm1.a)) {
                    return qtf0Var.t ? Next.a(Collections.singleton(ukm1.a)) : Next.a(Collections.singleton(vkm1.a));
                }
                if (glm1Var.equals(clm1.a)) {
                    return Next.a(Collections.singleton(wkm1.a));
                }
                if (glm1Var.equals(elm1.a)) {
                    return Next.a(Collections.singleton(xkm1.a));
                }
                boolean z2 = glm1Var instanceof blm1;
                fmf0 fmf0Var = fmf0.a;
                if (z2) {
                    blm1 blm1Var = (blm1) glm1Var;
                    String str3 = blm1Var.f;
                    String str4 = blm1Var.a;
                    boolean z3 = !str4.equals(str2) && str4.length() > 0;
                    boolean z4 = blm1Var.c;
                    String str5 = blm1Var.b;
                    String str6 = blm1Var.e;
                    if (z4) {
                        return z3 ? Next.i(qtf0.a(qtf0Var, str4, str5, str6, str3, emf0.a, blm1Var.g, blm1Var.h, blm1Var.i, blm1Var.j, blm1Var.d, null, 0, new dnf0(), 3072), Collections.singleton(new rkm1(str4))) : Next.h(qtf0.a(qtf0Var, str4, str5, str6, str3, null, blm1Var.g, blm1Var.h, blm1Var.i, blm1Var.j, blm1Var.d, null, 0, null, 7184));
                    }
                    return Next.h(qtf0.a(qtf0Var, str4, str5, str6, str3, fmf0Var, blm1Var.g, blm1Var.h, blm1Var.i, blm1Var.j, blm1Var.d, null, 0, null, 7168));
                }
                if (glm1Var instanceof alm1) {
                    alm1 alm1Var = (alm1) glm1Var;
                    if (!alm1Var.a.equals(str2)) {
                        return Next.j();
                    }
                    a9h a9hVar = alm1Var.b;
                    fef0 fef0Var = a9hVar.a;
                    int i4 = fef0Var.b;
                    return (i4 != 2 || fef0Var.h == 3) ? Next.h(qtf0.a(qtf0Var, null, null, null, null, fmf0Var, 0L, 0L, 0L, 0.0d, false, null, 0, null, 8175)) : Next.h(qtf0.a(qtf0Var, null, null, null, null, new cmf0(a9hVar), 0L, 0L, 0L, 0.0d, false, fef0Var.f, i4, new dnf0(), 1007));
                }
                if (glm1Var instanceof zkm1) {
                    zkm1 zkm1Var = (zkm1) glm1Var;
                    return zkm1Var.a.equals(str2) ? Next.h(qtf0.a(qtf0Var, null, null, null, null, new dmf0(zkm1Var.b), 0L, 0L, 0L, 0.0d, false, null, 0, null, 8175)) : Next.j();
                }
                if (!(glm1Var instanceof flm1)) {
                    eg.o();
                    return null;
                }
                flm1 flm1Var = (flm1) glm1Var;
                enf0 enf0Var = qtf0Var.Z;
                if (!(enf0Var instanceof dnf0)) {
                    return Next.j();
                }
                long jB = yqgVar.b();
                dnf0 dnf0VarA = (dnf0) enf0Var;
                if (dnf0VarA.d == 0) {
                    dnf0VarA = dnf0.a(dnf0VarA, 0, 0, 0, jB, 7);
                }
                List list = flm1Var.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    mkk1 mkk1Var = (mkk1) obj3;
                    int i5 = dnf0VarA.a;
                    int i6 = dnf0VarA.b;
                    int i7 = mkk1Var.a;
                    if (i7 > i5 || (i7 == i5 && mkk1Var.b > i6)) {
                        arrayList.add(obj3);
                    }
                }
                if (arrayList.isEmpty()) {
                    return Next.j();
                }
                Iterator it = arrayList.iterator();
                int i8 = 0;
                while (it.hasNext()) {
                    String str7 = ((mkk1) it.next()).c;
                    BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.ROOT);
                    characterInstance.setText(str7);
                    int i9 = 0;
                    while (characterInstance.next() != -1) {
                        i9++;
                    }
                    i8 += i9;
                }
                mkk1 mkk1Var2 = (mkk1) o7h.A0(arrayList);
                int i10 = dnf0VarA.c + i8;
                dnf0 dnf0VarA2 = dnf0.a(dnf0VarA, mkk1Var2.a, mkk1Var2.b, i10, 0L, 8);
                if (i10 >= 140) {
                    return jB - dnf0VarA2.d < 1500 ? Next.h(qtf0.a(qtf0Var, null, null, null, null, null, 0L, 0L, 0L, 0.0d, false, null, 0, dnf0VarA2, 4095)) : Next.i(qtf0.a(qtf0Var, null, null, null, null, null, 0L, 0L, 0L, 0.0d, false, null, 0, cnf0.a, 4095), Effects.a(new skm1[]{new skm1(str2, qtf0Var.b, qtf0Var.X, qtf0Var.Y)}));
                }
                return Next.h(qtf0.a(qtf0Var, null, null, null, null, null, 0L, 0L, 0L, 0.0d, false, null, 0, dnf0VarA2, 4095));
        }
    }
}
