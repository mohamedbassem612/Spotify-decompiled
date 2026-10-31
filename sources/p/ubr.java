package p;

import com.spotify.musicvideos.listvideofirstimpl.VideoFirstProto;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ubr implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ ubr(vr20 vr20Var, String str, String str2, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:63:0x012e  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final Object emit(Object obj, lnm lnmVar) {
        tbr tbrVar;
        gs11 gs11Var;
        gwn gwnVar;
        gwn hwnVar;
        wmj1 wmj1Var;
        Map mapO;
        Boolean bool;
        byte b = this.a;
        String str = this.d;
        String str2 = this.c;
        boolean zEquals = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof tbr) {
                    tbrVar = (tbr) lnmVar;
                    int i = tbrVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        tbrVar.b = i - Integer.MIN_VALUE;
                    } else {
                        tbrVar = new tbr(this, lnmVar);
                    }
                } else {
                    tbrVar = new tbr(this, lnmVar);
                }
                Object obj2 = tbrVar.a;
                int i2 = tbrVar.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    l0d0 l0d0Var = ((p0d0) obj).c;
                    if (!(l0d0Var instanceof m0d0)) {
                        if (l0d0Var instanceof l0d0) {
                            zEquals = u890.j(l0d0Var.a, str2);
                        } else if (l0d0Var instanceof n0d0) {
                            zEquals = ((n0d0) l0d0Var).a.equals(str);
                        } else {
                            eg.o();
                        }
                    }
                    Boolean boolValueOf = Boolean.valueOf(zEquals);
                    tbrVar.b = 1;
                    return vr20Var.emit(boolValueOf, tbrVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof gs11) {
                    gs11Var = (gs11) lnmVar;
                    int i3 = gs11Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        gs11Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        gs11Var = new gs11(this, lnmVar);
                    }
                } else {
                    gs11Var = new gs11(this, lnmVar);
                }
                Object obj3 = gs11Var.a;
                int i4 = gs11Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                fu6 fu6Var = (fu6) obj;
                if (fu6Var instanceof cu6) {
                    gwnVar = new gwn(127, (String) null, (String) null);
                } else {
                    boolean z = fu6Var instanceof eu6;
                    String str3 = this.c;
                    if (z && ((eu6) fu6Var).a.equals(str3)) {
                        hwnVar = new iwn(str3, 0L, 0L, this.d, (String) null, (String) null, (List) null, (dwn) null, (Map) null, false, (Map) null, 2032);
                    } else if ((fu6Var instanceof du6) && ((du6) fu6Var).a.equals(str3)) {
                        hwnVar = new hwn(str3, 0L, 0L, this.d, (String) null, (String) null, (List) null, (dwn) null, (Map) null, false, (Map) null, 2032);
                    } else {
                        gwnVar = new gwn(127, (String) null, (String) null);
                    }
                    gwnVar = hwnVar;
                }
                gs11Var.b = 1;
                return vr20Var.emit(gwnVar, gs11Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof wmj1) {
                    wmj1Var = (wmj1) lnmVar;
                    int i5 = wmj1Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        wmj1Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        wmj1Var = new wmj1(this, lnmVar);
                    }
                } else {
                    wmj1Var = new wmj1(this, lnmVar);
                }
                Object obj4 = wmj1Var.a;
                int i6 = wmj1Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                VideoFirstProto.UserState userState = (VideoFirstProto.UserState) ((VideoFirstProto.State) obj).o().get(str2);
                if (userState != null && (mapO = userState.o()) != null && (bool = (Boolean) mapO.get(str)) != null) {
                    zEquals = bool.booleanValue();
                }
                Boolean boolValueOf2 = Boolean.valueOf(zEquals);
                wmj1Var.b = 1;
                return vr20Var.emit(boolValueOf2, wmj1Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
