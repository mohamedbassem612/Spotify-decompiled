package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pov extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pov(ys70 ys70Var, nl9 nl9Var, hdn0 hdn0Var, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(4, lnmVar);
        this.a = (byte) 2;
        this.c = ys70Var;
        this.d = nl9Var;
        this.e = hdn0Var;
        this.f = ven0Var;
        this.g = ven0Var2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        switch (b) {
            case 0:
                pov povVar = new pov(obj7, obj6, obj5, (lnm) obj4, (byte) 0);
                povVar.b = (Set) obj;
                povVar.c = (ibk0) obj2;
                povVar.d = (g3d0) obj3;
                return povVar.invokeSuspend(rih1Var);
            case 1:
                pov povVar2 = new pov(obj7, obj6, obj5, (lnm) obj4, (byte) 1);
                povVar2.b = (suy) obj;
                povVar2.c = (hi40) obj2;
                povVar2.d = (n5f0) obj3;
                return povVar2.invokeSuspend(rih1Var);
            case 2:
                pov povVar3 = new pov((ys70) this.c, (nl9) this.d, (hdn0) obj7, (ven0) obj6, (ven0) obj5, (lnm) obj4);
                povVar3.b = (xs70) obj2;
                povVar3.invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                pov povVar4 = new pov((iu30) this.d, (c9n) obj7, (ven0) obj6, (et90) obj5, (lnm) obj4);
                povVar4.b = (bss0) obj;
                povVar4.c = (urs0) obj2;
                povVar4.invokeSuspend(rih1Var);
                return rih1Var;
            default:
                pov povVar5 = new pov(obj7, obj6, obj5, (lnm) obj4, (byte) 4);
                povVar5.b = (x440) obj;
                povVar5.c = (wtt0) obj2;
                povVar5.d = (yrt0) obj3;
                return povVar5.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    public final Object invokeSuspend(Object obj) {
        ewt0 ewt0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        Object obj3 = this.f;
        Object obj4 = this.g;
        switch (b) {
            case 0:
                Set set = (Set) this.b;
                ibk0 ibk0Var = (ibk0) this.c;
                g3d0 g3d0Var = (g3d0) this.d;
                hm5.M(obj);
                return ((zeu) ((jl1) obj2).b).i(((hti0) obj3).a, ibk0Var.b(), g3d0Var, (qxc0) obj4, set);
            case 1:
                suy suyVar = (suy) this.b;
                hi40 hi40Var = (hi40) this.c;
                n5f0 n5f0Var = (n5f0) this.d;
                hm5.M(obj);
                String str = (String) obj3;
                suyVar.getClass();
                String str2 = (String) obj4;
                PlayerState playerState = suyVar.b;
                long j = suyVar.a;
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                if (contextTrack != null) {
                    if (!l4o1.U(contextTrack) || l4o1.a0(contextTrack, "pointer.uri") == null) {
                        if (playerState.isBuffering() && playerState.isPlaying() && !playerState.isPaused() && n5f0Var != null) {
                            String strA0 = l4o1.a0(contextTrack, "media.start_position_creator_timestamp");
                            Long lD0 = strA0 != null ? nhc1.d0(10, strA0) : null;
                            if (lD0 != null && ((j == 0 || j == lD0.longValue()) && u890.j(suyVar.a(), str) && n5f0Var.c(lD0.longValue()))) {
                                return rrt0.c;
                            }
                        } else if (u890.j(suyVar.a(), str)) {
                            n5f0 n5f0Var2 = hi40Var.a;
                            long j2 = n5f0Var2.a;
                            long j3 = n5f0Var2.b;
                            if (j2 <= j && j <= j3) {
                                return kl1.D(playerState);
                            }
                        }
                    } else if (u890.j(l4o1.a0(contextTrack, "pointer.uri"), str2)) {
                        return kl1.D(playerState);
                    }
                }
                return rrt0.b;
            case 2:
                ven0 ven0Var = (ven0) obj3;
                xs70 xs70Var = (xs70) this.b;
                hm5.M(obj);
                if (xs70Var instanceof us70) {
                    int i = ((us70) xs70Var).a;
                    ((hdn0) obj2).t(i);
                    String str3 = ((xfh0) ((ys70) this.c).b.get(i)).f;
                    if (str3.equals((String) ven0Var.getValue())) {
                        return rih1Var;
                    }
                    ven0Var.setValue(str3);
                    return rih1Var;
                }
                if (!u890.j(xs70Var, vs70.a)) {
                    if (!u890.j(xs70Var, ws70.a)) {
                        eg.o();
                        return null;
                    }
                    ven0 ven0Var2 = (ven0) obj4;
                    ven0Var2.setValue(Boolean.valueOf(!((Boolean) ven0Var2.getValue()).booleanValue()));
                    return rih1Var;
                }
                zrg zrgVar = (zrg) ((nl9) this.d).h;
                lzn0 lzn0Var = zrgVar.b;
                if (lzn0Var.j(zrgVar.a)) {
                    lzn0Var.e();
                    return rih1Var;
                }
                zrgVar.c.l();
                return rih1Var;
            case 3:
                iu30 iu30Var = (iu30) this.d;
                ven0 ven0Var3 = (ven0) obj3;
                bss0 bss0Var = (bss0) this.b;
                urs0 urs0Var = (urs0) this.c;
                hm5.M(obj);
                if (u890.j(urs0Var, trs0.a)) {
                    faa0 faa0Var = (faa0) ven0Var3.getValue();
                    if (faa0Var != null) {
                        faa0Var.d((CancellationException) null);
                    }
                    iu30Var.invoke(ass0.a);
                    return rih1Var;
                }
                if (!u890.j(urs0Var, srs0.a)) {
                    eg.o();
                    return null;
                }
                if (bss0Var instanceof ass0) {
                    return rih1Var;
                }
                faa0 faa0Var2 = (faa0) ven0Var3.getValue();
                if (faa0Var2 != null) {
                    faa0Var2.d((CancellationException) null);
                }
                ven0Var3.setValue(fn31.T((c9n) obj2, (o8n) null, 0, new dvq0(iu30Var, (et90) obj4, (lnm) null, (byte) 10), 3));
                return rih1Var;
            default:
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                x440 x440Var = (x440) this.b;
                vtt0 vtt0Var = (wtt0) this.c;
                yrt0 yrt0Var = (yrt0) this.d;
                hm5.M(obj);
                if (yrt0Var == yrt0.a) {
                    return cwt0.a;
                }
                if (vtt0Var instanceof utt0) {
                    ewt0Var = null;
                } else {
                    if (!(vtt0Var instanceof vtt0)) {
                        eg.o();
                        return null;
                    }
                    int iOrdinal = vtt0Var.a.ordinal();
                    if (iOrdinal == 0) {
                        ewt0Var = ewt0.a;
                    } else if (iOrdinal == 1) {
                        ewt0Var = ewt0.d;
                    } else if (iOrdinal == 2) {
                        ewt0Var = ewt0.b;
                    } else if (iOrdinal == 3) {
                        ewt0Var = ewt0.c;
                    } else if (iOrdinal == 4) {
                        ewt0Var = ewt0.d;
                    } else {
                        if (iOrdinal != 5) {
                            eg.o();
                            return null;
                        }
                        ewt0Var = ewt0.e;
                    }
                }
                if (x440Var instanceof p440) {
                    return new uvt0(str5, ((p440) x440Var).a);
                }
                if (x440Var instanceof w440) {
                    return ewt0Var == null ? new bwt0(str5, str4, ((w440) x440Var).a) : new zvt0(str5, ewt0Var, ((w440) x440Var).a);
                }
                if (x440Var instanceof q440) {
                    String str6 = (String) obj3;
                    if (ewt0Var != null) {
                        return new zvt0(str6, ewt0Var, ((q440) x440Var).c);
                    }
                    q440 q440Var = (q440) x440Var;
                    return new vvt0(q440Var.b, str6, (String) obj4, q440Var.c, q440Var.a);
                }
                if (x440Var instanceof s440) {
                    if (ewt0Var != null) {
                        return new zvt0(str5, ewt0Var, ((s440) x440Var).b);
                    }
                    s440 s440Var = (s440) x440Var;
                    return new wvt0(str5, str4, s440Var.a, s440Var.b);
                }
                if (u890.j(x440Var, v440.a)) {
                    return awt0.a;
                }
                if (x440Var instanceof r440) {
                    return ewt0Var == null ? new xvt0(str5, str4, ((r440) x440Var).a) : new yvt0(str5, ewt0Var, ((r440) x440Var).a);
                }
                if (!u890.j(x440Var, t440.a) && !u890.j(x440Var, u440.a)) {
                    eg.o();
                    return null;
                }
                if (ewt0Var == null) {
                    return yrt0Var == yrt0.c ? fwt0.a : new dwt0(str5, str4);
                }
                return new zvt0(str5, ewt0Var, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pov(iu30 iu30Var, c9n c9nVar, ven0 ven0Var, et90 et90Var, lnm lnmVar) {
        super(4, lnmVar);
        this.a = (byte) 3;
        this.d = iu30Var;
        this.e = c9nVar;
        this.f = ven0Var;
        this.g = et90Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pov(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }
}
