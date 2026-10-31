package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lm9 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lm9(String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.c;
        switch (b) {
            case 0:
                lm9 lm9Var = new lm9(str, lnmVar, (byte) 0);
                lm9Var.b = obj;
                return lm9Var;
            case 1:
                lm9 lm9Var2 = new lm9(str, lnmVar, (byte) 1);
                lm9Var2.b = obj;
                return lm9Var2;
            case 2:
                lm9 lm9Var3 = new lm9(str, lnmVar, (byte) 2);
                lm9Var3.b = obj;
                return lm9Var3;
            case 3:
                lm9 lm9Var4 = new lm9(lnmVar, str, (byte) 3);
                lm9Var4.b = ((e331) obj).a;
                return lm9Var4;
            case 4:
                lm9 lm9Var5 = new lm9(str, lnmVar, (byte) 4);
                lm9Var5.b = obj;
                return lm9Var5;
            case 5:
                lm9 lm9Var6 = new lm9(str, lnmVar, (byte) 5);
                lm9Var6.b = obj;
                return lm9Var6;
            case 6:
                lm9 lm9Var7 = new lm9(str, lnmVar, (byte) 6);
                lm9Var7.b = obj;
                return lm9Var7;
            case 7:
                lm9 lm9Var8 = new lm9(lnmVar, str, (byte) 7);
                lm9Var8.b = ((e331) obj).a;
                return lm9Var8;
            case 8:
                lm9 lm9Var9 = new lm9(str, lnmVar, (byte) 8);
                lm9Var9.b = obj;
                return lm9Var9;
            default:
                lm9 lm9Var10 = new lm9(str, lnmVar, (byte) 9);
                lm9Var10.b = obj;
                return lm9Var10;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        String str = this.c;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((PlayerState) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((Set) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                Object obj3 = ((e331) obj).a;
                lm9 lm9Var = new lm9((lnm) obj2, str, (byte) 3);
                lm9Var.b = obj3;
                return lm9Var.invokeSuspend(rih1Var);
            case 4:
                return create((lj70) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((Boolean) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((wmj0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                Object obj4 = ((e331) obj).a;
                lm9 lm9Var2 = new lm9((lnm) obj2, str, (byte) 7);
                lm9Var2.b = obj4;
                return lm9Var2.invokeSuspend(rih1Var);
            case 8:
                return create((ji0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((Map) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        ContextTrack contextTrack;
        Set set;
        String str;
        Map map;
        byte b = this.a;
        Object obj2 = null;
        boolean z = false;
        String str2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                PlayerState playerState = (PlayerState) obj3;
                hm5.M(obj);
                if (!u890.j(playerState.playbackId().h(), str2) && (contextTrack = (ContextTrack) playerState.track().h()) != null && ul9.a(contextTrack) && ul9.b(playerState)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                hm5.M(obj);
                return Boolean.valueOf(!u890.j((String) obj3, str2));
            case 2:
                Set set2 = (Set) obj3;
                hm5.M(obj);
                return set2.contains(str2) ? dm61.u0(str2, set2) : dm61.x0(str2, set2);
            case 3:
                hm5.M(obj);
                boolean z2 = obj3 instanceof m231;
                if (!z2) {
                    ijo ijoVar = (ijo) (z2 ? null : obj3);
                    z = (ijoVar == null || (set = ijoVar.a) == null) ? false : set.contains(str2);
                }
                return Boolean.valueOf(z);
            case 4:
                lj70 lj70Var = (lj70) obj3;
                hm5.M(obj);
                if (u890.j(lj70Var.b, str2) && lj70Var.a.a == 33 && ((lj70Var instanceof jj70) || (lj70Var instanceof ij70))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                hm5.M(obj);
                return new mmr0(str2, ((Boolean) obj3).booleanValue() ? cji0.c : cji0.b);
            case 6:
                wmj0 wmj0Var = (wmj0) obj3;
                hm5.M(obj);
                aw21 aw21Var = wmj0Var.a;
                xv91 xv91Var = wmj0Var.c;
                if (xv91Var != null) {
                    str = xv91Var.a;
                    if (str.length() <= 0) {
                        if (aw21Var != null) {
                            return str2;
                        }
                        str = aw21Var.a;
                        if (str.length() <= 0) {
                            return str2;
                        }
                    }
                } else {
                    if (aw21Var != null) {
                        return str2;
                    }
                    str = aw21Var.a;
                    if (str.length() <= 0) {
                        return str2;
                    }
                }
                return str;
            case 7:
                hm5.M(obj);
                boolean z3 = obj3 instanceof m231;
                if (!z3) {
                    if (z3) {
                        obj3 = null;
                    }
                    b521 b521Var = (b521) obj3;
                    if (b521Var != null && (map = b521Var.a) != null) {
                        obj2 = (aol) map.get(str2);
                    }
                    z = obj2 instanceof xnl;
                }
                return Boolean.valueOf(z);
            case 8:
                hm5.M(obj);
                return Boolean.valueOf(u890.j(((ji0) obj3).a, str2));
            default:
                hm5.M(obj);
                String str3 = (String) ((Map) obj3).get("automix.transition_uri");
                if (str3 != null && !str3.equals(str2)) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lm9(lnm lnmVar, String str, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = str;
    }
}
