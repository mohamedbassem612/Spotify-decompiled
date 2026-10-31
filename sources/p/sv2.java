package p;

import com.spotify.audiorecognition.v1.AudioRecognitionResponse;
import com.spotify.connectivity.httpwebgate.WebgateTokenProvider;
import com.spotify.superconnect.v1.WritingStatusNotification;
import com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sv2 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv2(ogo ogoVar, v9u0 v9u0Var, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 1;
        this.c = ogoVar;
        this.d = v9u0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        byte b2 = 3;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                sv2 sv2Var = new sv2((int) b2, (lnm) obj3, (byte) 0);
                sv2Var.c = (vr20) obj;
                sv2Var.d = (WritingStatusNotification) obj2;
                return sv2Var.invokeSuspend(rih1Var);
            case 1:
                return new sv2((ogo) this.c, (v9u0) this.d, (lnm) obj3).invokeSuspend(rih1Var);
            case 2:
                return new sv2((v9u0) this.d, (lnm) obj3).invokeSuspend(rih1Var);
            case 3:
                sv2 sv2Var2 = new sv2(b2, (lnm) obj3, b2);
                sv2Var2.c = (vr20) obj;
                sv2Var2.d = (Throwable) obj2;
                return sv2Var2.invokeSuspend(rih1Var);
            default:
                sv2 sv2Var3 = new sv2((int) b2, (lnm) obj3, (byte) 4);
                sv2Var3.c = (vr20) obj;
                sv2Var3.d = (p28) obj2;
                return sv2Var3.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x028b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0296 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x0298  */
    /* JADX WARN: Code duplicated, block: B:131:0x029d  */
    /* JADX WARN: Code duplicated, block: B:132:0x02a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:134:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:136:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:138:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:142:0x02e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:147:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        Boolean bool;
        Boolean bool2;
        Object objD;
        Object objL;
        Object objB;
        Object objH;
        Object objJ;
        Object objJ2;
        Object objJ3;
        uqk0 uqk0Var;
        w7h1 w7h1VarH;
        Observable observableD;
        Object objJ4;
        ezc ezcVarG;
        zio0 zio0Var;
        sv2 sv2Var = this;
        byte b = sv2Var.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        boolean z = true;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) sv2Var.c;
                WritingStatusNotification writingStatusNotification = (WritingStatusNotification) sv2Var.d;
                byte b2 = sv2Var.b;
                if (b2 != 0) {
                    if (b2 == 1) {
                        hm5.M(obj);
                        obj3 = null;
                        sv2Var.c = vr20Var;
                        sv2Var.d = obj3;
                        sv2Var.b = (byte) 2;
                        if (hap1.i(30000L, sv2Var) != d9nVar) {
                        }
                    } else {
                        if (b2 != 2) {
                            if (b2 != 3) {
                                if (b2 == 4) {
                                    hm5.M(obj);
                                    obj2 = null;
                                    bool2 = Boolean.FALSE;
                                    sv2Var.c = obj2;
                                    sv2Var.d = obj2;
                                    sv2Var.b = (byte) 5;
                                    if (vr20Var.emit(bool2, sv2Var) != d9nVar) {
                                        return rih1Var;
                                    }
                                } else if (b2 != 5) {
                                    eg.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            }
                            hm5.M(obj);
                            return rih1Var;
                        }
                        hm5.M(obj);
                        obj3 = null;
                    }
                    bool = Boolean.FALSE;
                    sv2Var.c = obj3;
                    sv2Var.d = obj3;
                    sv2Var.b = (byte) 3;
                    if (vr20Var.emit(bool, sv2Var) != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    hm5.M(obj);
                    if (writingStatusNotification.n()) {
                        Boolean bool3 = Boolean.TRUE;
                        sv2Var.c = vr20Var;
                        obj3 = null;
                        sv2Var.d = null;
                        sv2Var.b = (byte) 1;
                        if (vr20Var.emit(bool3, sv2Var) != d9nVar) {
                            sv2Var.c = vr20Var;
                            sv2Var.d = obj3;
                            sv2Var.b = (byte) 2;
                            if (hap1.i(30000L, sv2Var) != d9nVar) {
                                bool = Boolean.FALSE;
                                sv2Var.c = obj3;
                                sv2Var.d = obj3;
                                sv2Var.b = (byte) 3;
                                if (vr20Var.emit(bool, sv2Var) != d9nVar) {
                                    return rih1Var;
                                }
                            }
                        }
                    } else {
                        obj2 = null;
                        sv2Var.c = vr20Var;
                        sv2Var.d = null;
                        sv2Var.b = (byte) 4;
                        if (hap1.i(1000L, sv2Var) != d9nVar) {
                            bool2 = Boolean.FALSE;
                            sv2Var.c = obj2;
                            sv2Var.d = obj2;
                            sv2Var.b = (byte) 5;
                            if (vr20Var.emit(bool2, sv2Var) != d9nVar) {
                                return rih1Var;
                            }
                        }
                    }
                }
                return d9nVar;
            case 1:
                v9u0 v9u0Var = (v9u0) sv2Var.d;
                g510 g510Var = v9u0Var.b;
                ogo ogoVar = (ogo) sv2Var.c;
                tv80 tv80Var = ogoVar.d;
                boolean z2 = ogoVar.c;
                String str = ogoVar.b;
                String str2 = ogoVar.a;
                switch (sv2Var.b) {
                    case 0:
                        hm5.M(obj);
                        if (str.length() == 0) {
                            ubc0 ubc0Var = tv80Var != null ? new ubc0(tv80Var) : null;
                            ccc0 ccc0Var = v9u0Var.g;
                            if (z2) {
                                sv2Var.b = (byte) 1;
                                objH = ccc0.h(ccc0Var, str2, ubc0Var, sv2Var, 2);
                                if (objH == d9nVar) {
                                    return d9nVar;
                                }
                                ((Boolean) objH).getClass();
                                if (tv80Var != null) {
                                    uqk0Var = new uqk0();
                                    if (str.length() == 0) {
                                        if (z2) {
                                            w7h1VarH = uqk0Var.p(str2);
                                        } else {
                                            w7h1VarH = uqk0Var.k(str2);
                                        }
                                    } else if (z2) {
                                        w7h1VarH = uqk0Var.o(str2, str);
                                    } else {
                                        w7h1VarH = uqk0Var.h(str, str2);
                                    }
                                    g510Var.b(SpotifyWearableListenerService.T0, w7h1VarH, tv80Var.a);
                                } else if (str.length() == 0) {
                                    m210 m210Var = SpotifyWearableListenerService.T0;
                                    boolean z3 = !z2;
                                    g510Var.getClass();
                                    Single singleFlatMap = Single.fromCallable(new e510(z3, g510Var, str2)).flatMap(new t64(z3, m210Var, g510Var));
                                    sv2Var.b = (byte) 5;
                                    objJ3 = fc11.j(singleFlatMap, sv2Var);
                                    if (objJ3 == d9nVar) {
                                        return d9nVar;
                                    }
                                    objJ3.getClass();
                                } else if (z2) {
                                    Single singleQ = g510.q(g510Var, SpotifyWearableListenerService.T0, g510Var.h.o(str2, str));
                                    sv2Var.b = (byte) 6;
                                    objJ2 = fc11.j(singleQ, sv2Var);
                                    if (objJ2 == d9nVar) {
                                        return d9nVar;
                                    }
                                    objJ2.getClass();
                                } else {
                                    Single singleQ2 = g510.q(g510Var, SpotifyWearableListenerService.T0, g510Var.h.h(str, str2));
                                    sv2Var.b = (byte) 7;
                                    objJ = fc11.j(singleQ2, sv2Var);
                                    if (objJ == d9nVar) {
                                        return d9nVar;
                                    }
                                    objJ.getClass();
                                }
                                kzq.Companion.getClass();
                                return jzq.b();
                            }
                            String str3 = ogoVar.a;
                            sv2Var.b = (byte) 2;
                            objB = ccc0.b(ccc0Var, str3, false, ubc0Var, sv2Var, 2);
                            if (objB == d9nVar) {
                                return d9nVar;
                            }
                            ((Boolean) objB).getClass();
                            if (tv80Var != null) {
                                uqk0Var = new uqk0();
                                if (str.length() == 0) {
                                    if (z2) {
                                        w7h1VarH = uqk0Var.p(str2);
                                    } else {
                                        w7h1VarH = uqk0Var.k(str2);
                                    }
                                } else if (z2) {
                                    w7h1VarH = uqk0Var.o(str2, str);
                                } else {
                                    w7h1VarH = uqk0Var.h(str, str2);
                                }
                                g510Var.b(SpotifyWearableListenerService.T0, w7h1VarH, tv80Var.a);
                            } else if (str.length() == 0) {
                                m210 m210Var2 = SpotifyWearableListenerService.T0;
                                boolean z4 = !z2;
                                g510Var.getClass();
                                Single singleFlatMap2 = Single.fromCallable(new e510(z4, g510Var, str2)).flatMap(new t64(z4, m210Var2, g510Var));
                                sv2Var.b = (byte) 5;
                                objJ3 = fc11.j(singleFlatMap2, sv2Var);
                                if (objJ3 == d9nVar) {
                                    return d9nVar;
                                }
                                objJ3.getClass();
                            } else if (z2) {
                                Single singleQ3 = g510.q(g510Var, SpotifyWearableListenerService.T0, g510Var.h.o(str2, str));
                                sv2Var.b = (byte) 6;
                                objJ2 = fc11.j(singleQ3, sv2Var);
                                if (objJ2 == d9nVar) {
                                    return d9nVar;
                                }
                                objJ2.getClass();
                            } else {
                                Single singleQ4 = g510.q(g510Var, SpotifyWearableListenerService.T0, g510Var.h.h(str, str2));
                                sv2Var.b = (byte) 7;
                                objJ = fc11.j(singleQ4, sv2Var);
                                if (objJ == d9nVar) {
                                    return d9nVar;
                                }
                                objJ.getClass();
                            }
                            kzq.Companion.getClass();
                            return jzq.b();
                        }
                        xyc0 xyc0Var = v9u0Var.f;
                        if (z2) {
                            List listSingletonList = Collections.singletonList(str2);
                            sv2Var.b = (byte) 3;
                            objL = xyc0Var.l(str, listSingletonList, sv2Var, tv80Var);
                            if (objL == d9nVar) {
                                return d9nVar;
                            }
                            ((py21) objL).d();
                            if (tv80Var != null) {
                                uqk0Var = new uqk0();
                                if (str.length() == 0) {
                                    if (z2) {
                                        w7h1VarH = uqk0Var.p(str2);
                                    } else {
                                        w7h1VarH = uqk0Var.k(str2);
                                    }
                                } else if (z2) {
                                    w7h1VarH = uqk0Var.o(str2, str);
                                } else {
                                    w7h1VarH = uqk0Var.h(str, str2);
                                }
                                g510Var.b(SpotifyWearableListenerService.T0, w7h1VarH, tv80Var.a);
                            } else if (str.length() == 0) {
                                m210 m210Var3 = SpotifyWearableListenerService.T0;
                                boolean z5 = !z2;
                                g510Var.getClass();
                                Single singleFlatMap3 = Single.fromCallable(new e510(z5, g510Var, str2)).flatMap(new t64(z5, m210Var3, g510Var));
                                sv2Var.b = (byte) 5;
                                objJ3 = fc11.j(singleFlatMap3, sv2Var);
                                if (objJ3 == d9nVar) {
                                    return d9nVar;
                                }
                                objJ3.getClass();
                            } else if (z2) {
                                Single singleQ5 = g510.q(g510Var, SpotifyWearableListenerService.T0, g510Var.h.o(str2, str));
                                sv2Var.b = (byte) 6;
                                objJ2 = fc11.j(singleQ5, sv2Var);
                                if (objJ2 == d9nVar) {
                                    return d9nVar;
                                }
                                objJ2.getClass();
                            } else {
                                Single singleQ6 = g510.q(g510Var, SpotifyWearableListenerService.T0, g510Var.h.h(str, str2));
                                sv2Var.b = (byte) 7;
                                objJ = fc11.j(singleQ6, sv2Var);
                                if (objJ == d9nVar) {
                                    return d9nVar;
                                }
                                objJ.getClass();
                            }
                            kzq.Companion.getClass();
                            return jzq.b();
                        }
                        String str4 = ogoVar.b;
                        List listSingletonList2 = Collections.singletonList(str2);
                        zxc0 zxc0Var = tv80Var != null ? new zxc0(tv80Var.a) : null;
                        sv2Var.b = (byte) 4;
                        objD = xyc0Var.d(str4, listSingletonList2, "wearos", "wearos", zxc0Var, this);
                        sv2Var = this;
                        if (objD == d9nVar) {
                            return d9nVar;
                        }
                        ((py21) objD).d();
                        if (tv80Var != null) {
                            uqk0Var = new uqk0();
                            if (str.length() == 0) {
                                if (z2) {
                                    w7h1VarH = uqk0Var.p(str2);
                                } else {
                                    w7h1VarH = uqk0Var.k(str2);
                                }
                            } else if (z2) {
                                w7h1VarH = uqk0Var.o(str2, str);
                            } else {
                                w7h1VarH = uqk0Var.h(str, str2);
                            }
                            g510Var.b(SpotifyWearableListenerService.T0, w7h1VarH, tv80Var.a);
                        } else if (str.length() == 0) {
                            m210 m210Var4 = SpotifyWearableListenerService.T0;
                            boolean z6 = !z2;
                            g510Var.getClass();
                            Single singleFlatMap4 = Single.fromCallable(new e510(z6, g510Var, str2)).flatMap(new t64(z6, m210Var4, g510Var));
                            sv2Var.b = (byte) 5;
                            objJ3 = fc11.j(singleFlatMap4, sv2Var);
                            if (objJ3 == d9nVar) {
                                return d9nVar;
                            }
                            objJ3.getClass();
                        } else if (z2) {
                            Single singleQ7 = g510.q(g510Var, SpotifyWearableListenerService.T0, g510Var.h.o(str2, str));
                            sv2Var.b = (byte) 6;
                            objJ2 = fc11.j(singleQ7, sv2Var);
                            if (objJ2 == d9nVar) {
                                return d9nVar;
                            }
                            objJ2.getClass();
                        } else {
                            Single singleQ8 = g510.q(g510Var, SpotifyWearableListenerService.T0, g510Var.h.h(str, str2));
                            sv2Var.b = (byte) 7;
                            objJ = fc11.j(singleQ8, sv2Var);
                            if (objJ == d9nVar) {
                                return d9nVar;
                            }
                            objJ.getClass();
                        }
                        kzq.Companion.getClass();
                        return jzq.b();
                    case 1:
                        hm5.M(obj);
                        objH = obj;
                        ((Boolean) objH).getClass();
                        if (tv80Var != null) {
                            uqk0Var = new uqk0();
                            if (str.length() == 0) {
                                if (z2) {
                                    w7h1VarH = uqk0Var.p(str2);
                                } else {
                                    w7h1VarH = uqk0Var.k(str2);
                                }
                            } else if (z2) {
                                w7h1VarH = uqk0Var.o(str2, str);
                            } else {
                                w7h1VarH = uqk0Var.h(str, str2);
                            }
                            g510Var.b(SpotifyWearableListenerService.T0, w7h1VarH, tv80Var.a);
                        } else if (str.length() == 0) {
                            m210 m210Var5 = SpotifyWearableListenerService.T0;
                            boolean z7 = !z2;
                            g510Var.getClass();
                            Single singleFlatMap5 = Single.fromCallable(new e510(z7, g510Var, str2)).flatMap(new t64(z7, m210Var5, g510Var));
                            sv2Var.b = (byte) 5;
                            objJ3 = fc11.j(singleFlatMap5, sv2Var);
                            if (objJ3 == d9nVar) {
                                return d9nVar;
                            }
                            objJ3.getClass();
                        } else if (z2) {
                            Single singleQ9 = g510.q(g510Var, SpotifyWearableListenerService.T0, g510Var.h.o(str2, str));
                            sv2Var.b = (byte) 6;
                            objJ2 = fc11.j(singleQ9, sv2Var);
                            if (objJ2 == d9nVar) {
                                return d9nVar;
                            }
                            objJ2.getClass();
                        } else {
                            Single singleQ10 = g510.q(g510Var, SpotifyWearableListenerService.T0, g510Var.h.h(str, str2));
                            sv2Var.b = (byte) 7;
                            objJ = fc11.j(singleQ10, sv2Var);
                            if (objJ == d9nVar) {
                                return d9nVar;
                            }
                            objJ.getClass();
                        }
                        kzq.Companion.getClass();
                        return jzq.b();
                    case 2:
                        hm5.M(obj);
                        objB = obj;
                        ((Boolean) objB).getClass();
                        if (tv80Var != null) {
                            uqk0Var = new uqk0();
                            if (str.length() == 0) {
                                if (z2) {
                                    w7h1VarH = uqk0Var.p(str2);
                                } else {
                                    w7h1VarH = uqk0Var.k(str2);
                                }
                            } else if (z2) {
                                w7h1VarH = uqk0Var.o(str2, str);
                            } else {
                                w7h1VarH = uqk0Var.h(str, str2);
                            }
                            g510Var.b(SpotifyWearableListenerService.T0, w7h1VarH, tv80Var.a);
                        } else if (str.length() == 0) {
                            m210 m210Var6 = SpotifyWearableListenerService.T0;
                            boolean z8 = !z2;
                            g510Var.getClass();
                            Single singleFlatMap6 = Single.fromCallable(new e510(z8, g510Var, str2)).flatMap(new t64(z8, m210Var6, g510Var));
                            sv2Var.b = (byte) 5;
                            objJ3 = fc11.j(singleFlatMap6, sv2Var);
                            if (objJ3 == d9nVar) {
                                return d9nVar;
                            }
                            objJ3.getClass();
                        } else if (z2) {
                            Single singleQ11 = g510.q(g510Var, SpotifyWearableListenerService.T0, g510Var.h.o(str2, str));
                            sv2Var.b = (byte) 6;
                            objJ2 = fc11.j(singleQ11, sv2Var);
                            if (objJ2 == d9nVar) {
                                return d9nVar;
                            }
                            objJ2.getClass();
                        } else {
                            Single singleQ12 = g510.q(g510Var, SpotifyWearableListenerService.T0, g510Var.h.h(str, str2));
                            sv2Var.b = (byte) 7;
                            objJ = fc11.j(singleQ12, sv2Var);
                            if (objJ == d9nVar) {
                                return d9nVar;
                            }
                            objJ.getClass();
                        }
                        kzq.Companion.getClass();
                        return jzq.b();
                    case 3:
                        hm5.M(obj);
                        objL = obj;
                        ((py21) objL).d();
                        if (tv80Var != null) {
                            uqk0Var = new uqk0();
                            if (str.length() == 0) {
                                if (z2) {
                                    w7h1VarH = uqk0Var.p(str2);
                                } else {
                                    w7h1VarH = uqk0Var.k(str2);
                                }
                            } else if (z2) {
                                w7h1VarH = uqk0Var.o(str2, str);
                            } else {
                                w7h1VarH = uqk0Var.h(str, str2);
                            }
                            g510Var.b(SpotifyWearableListenerService.T0, w7h1VarH, tv80Var.a);
                        } else if (str.length() == 0) {
                            m210 m210Var7 = SpotifyWearableListenerService.T0;
                            boolean z9 = !z2;
                            g510Var.getClass();
                            Single singleFlatMap7 = Single.fromCallable(new e510(z9, g510Var, str2)).flatMap(new t64(z9, m210Var7, g510Var));
                            sv2Var.b = (byte) 5;
                            objJ3 = fc11.j(singleFlatMap7, sv2Var);
                            if (objJ3 == d9nVar) {
                                return d9nVar;
                            }
                            objJ3.getClass();
                        } else if (z2) {
                            Single singleQ13 = g510.q(g510Var, SpotifyWearableListenerService.T0, g510Var.h.o(str2, str));
                            sv2Var.b = (byte) 6;
                            objJ2 = fc11.j(singleQ13, sv2Var);
                            if (objJ2 == d9nVar) {
                                return d9nVar;
                            }
                            objJ2.getClass();
                        } else {
                            Single singleQ14 = g510.q(g510Var, SpotifyWearableListenerService.T0, g510Var.h.h(str, str2));
                            sv2Var.b = (byte) 7;
                            objJ = fc11.j(singleQ14, sv2Var);
                            if (objJ == d9nVar) {
                                return d9nVar;
                            }
                            objJ.getClass();
                        }
                        kzq.Companion.getClass();
                        return jzq.b();
                    case 4:
                        hm5.M(obj);
                        objD = obj;
                        ((py21) objD).d();
                        if (tv80Var != null) {
                            uqk0Var = new uqk0();
                            if (str.length() == 0) {
                                if (z2) {
                                    w7h1VarH = uqk0Var.p(str2);
                                } else {
                                    w7h1VarH = uqk0Var.k(str2);
                                }
                            } else if (z2) {
                                w7h1VarH = uqk0Var.o(str2, str);
                            } else {
                                w7h1VarH = uqk0Var.h(str, str2);
                            }
                            g510Var.b(SpotifyWearableListenerService.T0, w7h1VarH, tv80Var.a);
                        } else if (str.length() == 0) {
                            m210 m210Var8 = SpotifyWearableListenerService.T0;
                            boolean z10 = !z2;
                            g510Var.getClass();
                            Single singleFlatMap8 = Single.fromCallable(new e510(z10, g510Var, str2)).flatMap(new t64(z10, m210Var8, g510Var));
                            sv2Var.b = (byte) 5;
                            objJ3 = fc11.j(singleFlatMap8, sv2Var);
                            if (objJ3 == d9nVar) {
                                return d9nVar;
                            }
                            objJ3.getClass();
                        } else if (z2) {
                            Single singleQ15 = g510.q(g510Var, SpotifyWearableListenerService.T0, g510Var.h.o(str2, str));
                            sv2Var.b = (byte) 6;
                            objJ2 = fc11.j(singleQ15, sv2Var);
                            if (objJ2 == d9nVar) {
                                return d9nVar;
                            }
                            objJ2.getClass();
                        } else {
                            Single singleQ16 = g510.q(g510Var, SpotifyWearableListenerService.T0, g510Var.h.h(str, str2));
                            sv2Var.b = (byte) 7;
                            objJ = fc11.j(singleQ16, sv2Var);
                            if (objJ == d9nVar) {
                                return d9nVar;
                            }
                            objJ.getClass();
                        }
                        kzq.Companion.getClass();
                        return jzq.b();
                    case 5:
                        hm5.M(obj);
                        objJ3 = obj;
                        objJ3.getClass();
                        kzq.Companion.getClass();
                        return jzq.b();
                    case 6:
                        hm5.M(obj);
                        objJ2 = obj;
                        objJ2.getClass();
                        kzq.Companion.getClass();
                        return jzq.b();
                    case 7:
                        hm5.M(obj);
                        objJ = obj;
                        objJ.getClass();
                        kzq.Companion.getClass();
                        return jzq.b();
                    default:
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 2:
                v9u0 v9u0Var2 = (v9u0) sv2Var.d;
                byte b3 = sv2Var.b;
                if (b3 != 0) {
                    if (b3 == 1) {
                        observableD = (Observable) sv2Var.c;
                        hm5.M(obj);
                    } else if (b3 == 2) {
                        observableD = (Observable) sv2Var.c;
                        hm5.M(obj);
                        objJ4 = obj;
                        zor.i(v9u0Var2.e, ((ou80) objJ4).a, 6);
                        ezcVarG = yoi1.g(observableD);
                        zio0Var = new zio0(2, (lnm) null, (byte) 9);
                        sv2Var.c = null;
                        sv2Var.b = (byte) 3;
                        if (b5p1.j(ezcVarG, zio0Var, sv2Var) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (b3 != 3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    kzq.Companion.getClass();
                    return jzq.b();
                }
                hm5.M(obj);
                observableD = v9u0Var2.c.d();
                ezc ezcVarG2 = yoi1.g(observableD);
                zio0 zio0Var2 = new zio0(2, (lnm) null, (byte) 8);
                sv2Var.c = observableD;
                sv2Var.b = (byte) 1;
                if (b5p1.j(ezcVarG2, zio0Var2, sv2Var) == d9nVar) {
                    return d9nVar;
                }
                g510 g510Var2 = v9u0Var2.b;
                m210 m210Var9 = SpotifyWearableListenerService.T0;
                String strP = g510Var2.p();
                if (strP == null) {
                    strP = "";
                }
                Single singleQ17 = g510.q(g510Var2, m210Var9, g510Var2.h.j(strP));
                sv2Var.c = observableD;
                sv2Var.b = (byte) 2;
                objJ4 = fc11.j(singleQ17, sv2Var);
                if (objJ4 == d9nVar) {
                    return d9nVar;
                }
                zor.i(v9u0Var2.e, ((ou80) objJ4).a, 6);
                ezcVarG = yoi1.g(observableD);
                zio0Var = new zio0(2, (lnm) null, (byte) 9);
                sv2Var.c = null;
                sv2Var.b = (byte) 3;
                if (b5p1.j(ezcVarG, zio0Var, sv2Var) == d9nVar) {
                    return d9nVar;
                }
                kzq.Companion.getClass();
                return jzq.b();
            case 3:
                vr20 vr20Var2 = (vr20) sv2Var.c;
                Throwable th = (Throwable) sv2Var.d;
                byte b4 = sv2Var.b;
                if (b4 != 0) {
                    if (b4 == 1 || b4 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if ((th instanceof pq8) || (th instanceof WebgateTokenProvider.WebgateTokenException)) {
                    uu81 uu81Var = new uu81(th);
                    sv2Var.c = null;
                    sv2Var.d = null;
                    sv2Var.b = (byte) 1;
                    if (vr20Var2.emit(uu81Var, sv2Var) != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    tu81 tu81Var = new tu81(th);
                    sv2Var.c = null;
                    sv2Var.d = null;
                    sv2Var.b = (byte) 2;
                    if (vr20Var2.emit(tu81Var, sv2Var) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
            default:
                vr20 vr20Var3 = (vr20) sv2Var.c;
                n28 n28Var = (p28) sv2Var.d;
                byte b5 = sv2Var.b;
                if (b5 == 0) {
                    hm5.M(obj);
                    if (!u890.j(n28Var, o28.a)) {
                        if (n28Var instanceof n28) {
                            AudioRecognitionResponse audioRecognitionResponse = n28Var.a;
                            int iQ = audioRecognitionResponse.q();
                            int i = iQ == 0 ? -1 : gil1.a[l1d.C(iQ)];
                            if (i != 1) {
                                if (i == 2) {
                                    u18 u18Var = new u18(audioRecognitionResponse.o().o(), audioRecognitionResponse.p(), audioRecognitionResponse.o().getPlaylistUri());
                                    sv2Var.c = null;
                                    sv2Var.d = null;
                                    sv2Var.b = (byte) 2;
                                    if (vr20Var3.emit(u18Var, sv2Var) == d9nVar) {
                                        return d9nVar;
                                    }
                                } else if (i == 3) {
                                    v18 v18Var = new v18(audioRecognitionResponse.p());
                                    sv2Var.c = null;
                                    sv2Var.d = null;
                                    sv2Var.b = (byte) 3;
                                    if (vr20Var3.emit(v18Var, sv2Var) == d9nVar) {
                                        return d9nVar;
                                    }
                                } else if (i == 4) {
                                    s18 s18Var = new s18(audioRecognitionResponse.n().getMessage());
                                    sv2Var.c = null;
                                    sv2Var.d = null;
                                    sv2Var.b = (byte) 4;
                                    if (vr20Var3.emit(s18Var, sv2Var) == d9nVar) {
                                        return d9nVar;
                                    }
                                } else if (i != 5) {
                                    eg.o();
                                }
                                z = false;
                            } else {
                                sv2Var.c = null;
                                sv2Var.d = null;
                                sv2Var.b = (byte) 1;
                                if (vr20Var3.emit(r18.a, sv2Var) == d9nVar) {
                                    return d9nVar;
                                }
                            }
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                } else if (b5 == 1) {
                    hm5.M(obj);
                } else {
                    if (b5 != 2 && b5 != 3 && b5 != 4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sv2(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv2(v9u0 v9u0Var, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 2;
        this.d = v9u0Var;
    }
}
