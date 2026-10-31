package p;

import android.net.Uri;
import android.webkit.WebView;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.SleepTimer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class s4q0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public s4q0(pdw0 pdw0Var, vr20 vr20Var) {
        this.a = (byte) 20;
        this.c = pdw0Var;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object b(Object obj, lnm lnmVar) {
        h1x0 h1x0Var;
        mq70 mq70Var;
        up70 up70VarA;
        if (lnmVar instanceof h1x0) {
            h1x0Var = (h1x0) lnmVar;
            int i = h1x0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                h1x0Var.b = i - Integer.MIN_VALUE;
            } else {
                h1x0Var = new h1x0(this, lnmVar);
            }
        } else {
            h1x0Var = new h1x0(this, lnmVar);
        }
        Object obj2 = h1x0Var.a;
        int i2 = h1x0Var.b;
        String str = null;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            f1x0 f1x0Var = (f1x0) obj;
            String str2 = ((c1x0) this.c).c.a;
            jo70 jo70Var = f1x0Var.a;
            String str3 = jo70Var != null ? jo70Var.a : null;
            String str4 = str3 == null ? "" : str3;
            Set set = s4b1.f;
            String strS = uic.x(str2).s();
            String str5 = strS == null ? "" : strS;
            xkk1 xkk1Var = f1x0Var.b;
            if (xkk1Var != null && (mq70Var = xkk1Var.a) != null && (up70VarA = mq70Var.a(vp70.c)) != null) {
                str = up70VarA.a.a;
            }
            e1x0 e1x0Var = new e1x0(str2, str5, (Integer) null, str == null ? "" : str, str4);
            h1x0Var.b = 1;
            Object objEmit = vr20Var.emit(e1x0Var, h1x0Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final Object c(Object obj, lnm lnmVar) {
        glx0 glx0Var;
        if (lnmVar instanceof glx0) {
            glx0Var = (glx0) lnmVar;
            int i = glx0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                glx0Var.b = i - Integer.MIN_VALUE;
            } else {
                glx0Var = new glx0(this, lnmVar);
            }
        } else {
            glx0Var = new glx0(this, lnmVar);
        }
        Object obj2 = glx0Var.a;
        int i2 = glx0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            Map map = (Map) obj;
            z310 z310Var = (z310) this.c;
            List<u310> list = z310Var.a;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            for (u310 u310Var : list) {
                Float fG = fj30.G((iix0) map.get(u310Var.a));
                arrayList.add(u310.b(u310Var, (String) null, (String) null, (Uri) null, 0, fG != null ? new Double(fG.floatValue()) : null, (String) null, 0, (y310) null, (String) null, (Map) null, (Uri) null, (q510) null, -262145, 15));
            }
            z310 z310VarA = z310.a(z310Var, arrayList, (f410) null, 14);
            glx0Var.b = 1;
            Object objEmit = vr20Var.emit(z310VarA, glx0Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object e(Object obj, lnm lnmVar) {
        p0y0 p0y0Var;
        if (lnmVar instanceof p0y0) {
            p0y0Var = (p0y0) lnmVar;
            int i = p0y0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                p0y0Var.b = i - Integer.MIN_VALUE;
            } else {
                p0y0Var = new p0y0(this, lnmVar);
            }
        } else {
            p0y0Var = new p0y0(this, lnmVar);
        }
        Object obj2 = p0y0Var.a;
        int i2 = p0y0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            oy21 oy21Var = (py21) obj;
            ewq0 ewq0Var = new ewq0((tzr0) this.c, (byte) 21);
            oy21Var.getClass();
            if (oy21Var instanceof ly21) {
                k220.i(((ly21) oy21Var).a.b());
                return null;
            }
            if (!(oy21Var instanceof oy21)) {
                eg.o();
                return null;
            }
            Object objInvoke = ewq0Var.invoke(oy21Var.a);
            p0y0Var.b = 1;
            Object objEmit = vr20Var.emit(objInvoke, p0y0Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object f(Object obj, lnm lnmVar) {
        v7y0 v7y0Var;
        if (lnmVar instanceof v7y0) {
            v7y0Var = (v7y0) lnmVar;
            int i = v7y0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                v7y0Var.b = i - Integer.MIN_VALUE;
            } else {
                v7y0Var = new v7y0(this, lnmVar);
            }
        } else {
            v7y0Var = new v7y0(this, lnmVar);
        }
        Object obj2 = v7y0Var.a;
        int i2 = v7y0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            le30 le30VarA = ((me30) this.c).a((String) obj);
            int i3 = w7y0.b;
            fo01 fo01Var = (le30VarA == le30.b1 || le30VarA == le30.c1) ? fo01.b : fo01.a;
            v7y0Var.b = 1;
            Object objEmit = vr20Var.emit(fo01Var, v7y0Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object g(Object obj, lnm lnmVar) {
        quy0 quy0Var;
        l0l l0lVarC;
        if (lnmVar instanceof quy0) {
            quy0Var = (quy0) lnmVar;
            int i = quy0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                quy0Var.b = i - Integer.MIN_VALUE;
            } else {
                quy0Var = new quy0(this, lnmVar);
            }
        } else {
            quy0Var = new quy0(this, lnmVar);
        }
        Object obj2 = quy0Var.a;
        int i2 = quy0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            zyc zycVar = (zyc) obj;
            suy0 suy0Var = (suy0) this.c;
            if (((Boolean) zycVar.b.q.getValue()).booleanValue() && f46.S0(new Integer[]{2, 3}).contains(Integer.valueOf(zycVar.d)) && (l0lVarC = suy0Var.b.c()) != null && !l0lVarC.l()) {
                quy0Var.b = 1;
                Object objEmit = vr20Var.emit(obj, quy0Var);
                d9n d9nVar = d9n.a;
                if (objEmit == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0220  */
    /* JADX WARN: Code duplicated, block: B:169:0x029e  */
    /* JADX WARN: Code duplicated, block: B:192:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:208:0x034b  */
    /* JADX WARN: Code duplicated, block: B:231:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:260:0x042e  */
    /* JADX WARN: Code duplicated, block: B:295:0x049e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:334:0x053f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:373:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:397:0x0624  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:422:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:436:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:438:0x0702  */
    /* JADX WARN: Code duplicated, block: B:440:0x0705  */
    /* JADX WARN: Code duplicated, block: B:443:0x070a  */
    /* JADX WARN: Code duplicated, block: B:445:0x070f  */
    /* JADX WARN: Code duplicated, block: B:448:0x0714  */
    /* JADX WARN: Code duplicated, block: B:460:0x0734  */
    /* JADX WARN: Code duplicated, block: B:479:0x0781  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:662:0x0a43  */
    /* JADX WARN: Code duplicated, block: B:678:0x0a85  */
    /* JADX WARN: Code duplicated, block: B:741:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:752:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0151  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    public final Object emit(Object obj, lnm lnmVar) {
        r4q0 r4q0Var;
        e9q0 e9q0Var;
        g8r0 g8r0Var;
        boolean zB;
        l9r0 l9r0Var;
        m2s0 m2s0Var;
        r2s0 r2s0Var;
        j2s0 i2s0Var;
        String str;
        int iOrdinal;
        uss0 uss0Var;
        vr20 vr20Var;
        z310 z310Var;
        fvs0 fvs0Var;
        yzs0 yzs0Var;
        n0t0 n0t0Var;
        not0 not0Var;
        gxt0 gxt0Var;
        ext0 ext0Var;
        ktl ktlVar;
        b8u0 b8u0Var;
        zbu0 zbu0Var;
        mdu0 mdu0Var;
        teu0 teu0Var;
        lou0 lou0Var;
        List list;
        pvc0 pvc0Var;
        String str2;
        goj0 goj0VarA;
        l1z l1zVar;
        vpw0 vpw0Var;
        l2r0 l2r0Var;
        qdx0 qdx0Var;
        ozy0 ozy0Var;
        vr20 vr20Var2;
        ndh0 ndh0Var;
        byte b = this.a;
        String str3 = "";
        boolean z = false;
        i = 0;
        i = 0;
        int i = 0;
        z = false;
        boolean z2 = false;
        z = false;
        boolean z3 = false;
        z = false;
        boolean z4 = false;
        int i2 = 0;
        int i3 = 0;
        z = false;
        boolean z5 = false;
        int i4 = 0;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object objB = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof r4q0) {
                    r4q0Var = (r4q0) lnmVar;
                    int i5 = r4q0Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        r4q0Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        r4q0Var = new r4q0(this, lnmVar);
                    }
                } else {
                    r4q0Var = new r4q0(this, lnmVar);
                }
                Object obj4 = r4q0Var.a;
                int i6 = r4q0Var.b;
                if (i6 == 0) {
                    hm5.M(obj4);
                    Boolean boolValueOf = Boolean.valueOf(((u4q0) obj2).f((List) obj));
                    r4q0Var.b = 1;
                    if (((vr20) obj3).emit(boolValueOf, r4q0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i6 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj4);
                }
                return rih1Var;
            case 1:
                if (lnmVar instanceof e9q0) {
                    e9q0Var = (e9q0) lnmVar;
                    int i7 = e9q0Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        e9q0Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        e9q0Var = new e9q0(this, lnmVar);
                    }
                } else {
                    e9q0Var = new e9q0(this, lnmVar);
                }
                Object obj5 = e9q0Var.a;
                int i8 = e9q0Var.b;
                if (i8 == 0) {
                    hm5.M(obj5);
                    b9q0 b9q0Var = new b9q0((rnd0) obj2, (Boolean) obj);
                    e9q0Var.b = 1;
                    if (((vr20) obj3).emit(b9q0Var, e9q0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i8 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj5);
                }
                return rih1Var;
            case 2:
                if (lnmVar instanceof g8r0) {
                    g8r0Var = (g8r0) lnmVar;
                    int i9 = g8r0Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        g8r0Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        g8r0Var = new g8r0(this, lnmVar);
                    }
                } else {
                    g8r0Var = new g8r0(this, lnmVar);
                }
                Object obj6 = g8r0Var.a;
                int i10 = g8r0Var.b;
                if (i10 == 0) {
                    hm5.M(obj6);
                    vr20 vr20Var3 = (vr20) obj3;
                    ldg1 ldg1Var = (ldg1) obj;
                    if (u890.j(ldg1Var != null ? ldg1Var.a : null, "en")) {
                        z = true;
                    } else if (u890.j(ldg1Var != null ? ldg1Var.b : null, "Latn")) {
                        String str4 = ldg1Var.a;
                        jw4 jw4Var = (jw4) ((sjq0) obj2).b;
                        switch (str4) {
                            case "af":
                                zB = jw4Var.b();
                                z = zB;
                                break;
                            case "be":
                                zB = jw4Var.c();
                                z = zB;
                                break;
                            case "bs":
                                zB = jw4Var.d();
                                z = zB;
                                break;
                            case "ca":
                                zB = jw4Var.e();
                                z = zB;
                                break;
                            case "cs":
                                zB = jw4Var.f();
                                z = zB;
                                break;
                            case "da":
                                zB = jw4Var.g();
                                z = zB;
                                break;
                            case "de":
                                zB = jw4Var.h();
                                z = zB;
                                break;
                            case "es":
                                zB = jw4Var.i();
                                z = zB;
                                break;
                            case "et":
                                zB = jw4Var.j();
                                z = zB;
                                break;
                            case "eu":
                                zB = jw4Var.k();
                                z = zB;
                                break;
                            case "fi":
                                zB = jw4Var.l();
                                z = zB;
                                break;
                            case "fr":
                                zB = jw4Var.m();
                                z = zB;
                                break;
                            case "hi":
                                zB = jw4Var.n();
                                z = zB;
                                break;
                            case "hr":
                                zB = jw4Var.o();
                                z = zB;
                                break;
                            case "hu":
                                zB = jw4Var.p();
                                z = zB;
                                break;
                            case "id":
                                zB = jw4Var.q();
                                z = zB;
                                break;
                            case "is":
                                zB = jw4Var.r();
                                z = zB;
                                break;
                            case "it":
                                zB = jw4Var.s();
                                z = zB;
                                break;
                            case "kk":
                                zB = jw4Var.t();
                                z = zB;
                                break;
                            case "lt":
                                zB = jw4Var.u();
                                z = zB;
                                break;
                            case "lv":
                                zB = jw4Var.v();
                                z = zB;
                                break;
                            case "ms":
                                zB = jw4Var.w();
                                z = zB;
                                break;
                            case "nb":
                                zB = jw4Var.x();
                                z = zB;
                                break;
                            case "nl":
                                zB = jw4Var.y();
                                z = zB;
                                break;
                            case "no":
                                zB = jw4Var.z();
                                z = zB;
                                break;
                            case "pl":
                                zB = jw4Var.A();
                                z = zB;
                                break;
                            case "pt":
                                zB = jw4Var.B();
                                z = zB;
                                break;
                            case "ro":
                                zB = jw4Var.C();
                                z = zB;
                                break;
                            case "sk":
                                zB = jw4Var.D();
                                z = zB;
                                break;
                            case "sl":
                                zB = jw4Var.E();
                                z = zB;
                                break;
                            case "sq":
                                zB = jw4Var.F();
                                z = zB;
                                break;
                            case "sr":
                                zB = jw4Var.G();
                                z = zB;
                                break;
                            case "sv":
                                zB = jw4Var.H();
                                z = zB;
                                break;
                            case "sw":
                                zB = jw4Var.I();
                                z = zB;
                                break;
                            case "tr":
                                zB = jw4Var.J();
                                z = zB;
                                break;
                            case "uz":
                                zB = jw4Var.K();
                                z = zB;
                                break;
                            case "vi":
                                zB = jw4Var.L();
                                z = zB;
                                break;
                            case "zu":
                                zB = jw4Var.M();
                                z = zB;
                                break;
                            default:
                                z = true;
                                break;
                        }
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(z);
                    g8r0Var.b = 1;
                    if (vr20Var3.emit(boolValueOf2, g8r0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i10 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj6);
                }
                return rih1Var;
            case 3:
                if (lnmVar instanceof l9r0) {
                    l9r0Var = (l9r0) lnmVar;
                    int i11 = l9r0Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        l9r0Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        l9r0Var = new l9r0(this, lnmVar);
                    }
                } else {
                    l9r0Var = new l9r0(this, lnmVar);
                }
                Object obj7 = l9r0Var.a;
                int i12 = l9r0Var.b;
                if (i12 == 0) {
                    hm5.M(obj7);
                    vr20 vr20Var4 = (vr20) obj3;
                    th61 th61Var = (th61) obj;
                    if (th61Var.b) {
                        n9r0 n9r0Var = (n9r0) obj2;
                        objB = n9r0Var.b.b.b(n9r0Var.a, th61Var.a);
                    }
                    l9r0Var.b = 1;
                    if (vr20Var4.emit(objB, l9r0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i12 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj7);
                }
                return rih1Var;
            case 4:
                if (lnmVar instanceof m2s0) {
                    m2s0Var = (m2s0) lnmVar;
                    int i13 = m2s0Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        m2s0Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        m2s0Var = new m2s0(this, lnmVar);
                    }
                } else {
                    m2s0Var = new m2s0(this, lnmVar);
                }
                Object obj8 = m2s0Var.a;
                int i14 = m2s0Var.b;
                if (i14 == 0) {
                    hm5.M(obj8);
                    vr20 vr20Var5 = (vr20) obj3;
                    ep20 ep20Var = new ep20(z561.X(wvr0.c1, new i46((List) obj, (byte) 1)));
                    while (ep20Var.hasNext()) {
                        Object next = ep20Var.next();
                        if (u890.j(((r2s0) next).c, ((e3s0) obj2).a)) {
                            objB = next;
                            r2s0Var = (r2s0) objB;
                            i2s0Var = k2s0.a;
                            if (r2s0Var != null) {
                                str = r2s0Var.b;
                                iOrdinal = r2s0Var.a.ordinal();
                                if (iOrdinal != 0) {
                                    i2s0Var = new i2s0(str != null ? str : "");
                                } else if (iOrdinal == 1) {
                                    i2s0Var = new j2s0(str != null ? str : "");
                                }
                            }
                            m2s0Var.b = 1;
                            if (vr20Var5.emit(i2s0Var, m2s0Var) == d9nVar) {
                                return d9nVar;
                            }
                        }
                    }
                    r2s0Var = (r2s0) objB;
                    i2s0Var = k2s0.a;
                    if (r2s0Var != null) {
                        str = r2s0Var.b;
                        iOrdinal = r2s0Var.a.ordinal();
                        if (iOrdinal != 0) {
                            i2s0Var = new i2s0(str != null ? str : "");
                        } else if (iOrdinal == 1) {
                            i2s0Var = new j2s0(str != null ? str : "");
                        }
                    }
                    m2s0Var.b = 1;
                    if (vr20Var5.emit(i2s0Var, m2s0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i14 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj8);
                }
                return rih1Var;
            case 5:
                WebView webView = (WebView) ((ven0) obj3).getValue();
                if (webView != null) {
                    webView.loadUrl((String) obj2);
                }
                return rih1Var;
            case 6:
                if (lnmVar instanceof uss0) {
                    uss0Var = (uss0) lnmVar;
                    int i15 = uss0Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        uss0Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        uss0Var = new uss0(this, lnmVar);
                    }
                } else {
                    uss0Var = new uss0(this, lnmVar);
                }
                Object objC = uss0Var.a;
                int i16 = uss0Var.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        i4 = uss0Var.d;
                        z310Var = uss0Var.f;
                        vr20Var = uss0Var.c;
                        hm5.M(objC);
                    } else {
                        if (i16 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objC);
                    }
                    return rih1Var;
                }
                hm5.M(objC);
                vr20Var = (vr20) obj3;
                z310Var = (z310) obj;
                z310Var.getClass();
                List list2 = z310Var.a;
                uss0Var.c = vr20Var;
                uss0Var.f = z310Var;
                uss0Var.d = 0;
                uss0Var.b = 1;
                objC = ((vss0) obj2).c(list2, uss0Var);
                if (objC == d9nVar) {
                    return d9nVar;
                }
                z310 z310VarA = z310.a(z310Var, (List) objC, (f410) null, 14);
                uss0Var.c = null;
                uss0Var.f = null;
                uss0Var.d = i4;
                uss0Var.b = 2;
                if (vr20Var.emit(z310VarA, uss0Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 7:
                if (lnmVar instanceof fvs0) {
                    fvs0Var = (fvs0) lnmVar;
                    int i17 = fvs0Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        fvs0Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        fvs0Var = new fvs0(this, lnmVar);
                    }
                } else {
                    fvs0Var = new fvs0(this, lnmVar);
                }
                Object obj9 = fvs0Var.a;
                int i18 = fvs0Var.b;
                if (i18 == 0) {
                    hm5.M(obj9);
                    vr20 vr20Var6 = (vr20) obj3;
                    cma1 cma1Var = (cma1) obj;
                    if (((gvs0) obj2).a()) {
                        Boolean bool = (Boolean) cma1Var.a;
                        if (bool != null ? bool.booleanValue() : false) {
                            z5 = true;
                        }
                    }
                    Boolean boolValueOf3 = Boolean.valueOf(z5);
                    fvs0Var.b = 1;
                    if (vr20Var6.emit(boolValueOf3, fvs0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i18 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj9);
                }
                return rih1Var;
            case 8:
                ytp0 ytp0Var = (ytp0) obj2;
                if (lnmVar instanceof yzs0) {
                    yzs0Var = (yzs0) lnmVar;
                    int i19 = yzs0Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        yzs0Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        yzs0Var = new yzs0(this, lnmVar);
                    }
                } else {
                    yzs0Var = new yzs0(this, lnmVar);
                }
                Object obj10 = yzs0Var.a;
                int i20 = yzs0Var.b;
                if (i20 == 0) {
                    hm5.M(obj10);
                    vr20 vr20Var7 = (vr20) obj3;
                    int iIntValue = ((Number) obj).intValue();
                    long jE = ((yqg) ytp0Var.d).e() - ((qes) ytp0Var.c).a.g(o1t0.a, 0L);
                    int i21 = (int) ((jE >= 0 ? jE : 0L) / 1000);
                    if (Integer.MIN_VALUE <= iIntValue && iIntValue < 4) {
                        n0t0Var = new n0t0(0);
                    } else if (4 > iIntValue || iIntValue >= 7) {
                        if (i21 == 60) {
                            i3 = 60;
                        } else if (i21 < 60) {
                            i3 = 60 - i21;
                        }
                        n0t0Var = new n0t0(i3);
                    } else {
                        if (i21 == 30) {
                            i2 = 30;
                        } else if (i21 < 30) {
                            i2 = 30 - i21;
                        }
                        n0t0Var = new n0t0(i2);
                    }
                    yzs0Var.b = 1;
                    if (vr20Var7.emit(n0t0Var, yzs0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i20 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj10);
                }
                return rih1Var;
            case 9:
                mmr0 mmr0Var = (mmr0) obj;
                c9n c9nVar = (c9n) obj2;
                w4t0 w4t0Var = (w4t0) obj3;
                xic1 xic1Var = (ajc1) mmr0Var.a;
                o5e0 o5e0Var = (o5e0) mmr0Var.b;
                if (xic1Var instanceof xic1) {
                    w4t0Var.h(xic1Var.a);
                    smo1.p(c9nVar, (CancellationException) null);
                } else if (!o5e0Var.h() && !o5e0Var.b()) {
                    w4t0Var.h(new Throwable("LCR couldn't load items"));
                    smo1.p(c9nVar, (CancellationException) null);
                } else if ((xic1Var instanceof zic1) || o5e0Var.b()) {
                    w4t0Var.j();
                } else if (o5e0Var.h()) {
                    w4t0Var.i();
                    smo1.p(c9nVar, (CancellationException) null);
                }
                return rih1Var;
            case 10:
                if (lnmVar instanceof not0) {
                    not0Var = (not0) lnmVar;
                    int i22 = not0Var.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        not0Var.b = i22 - Integer.MIN_VALUE;
                    } else {
                        not0Var = new not0(this, lnmVar);
                    }
                } else {
                    not0Var = new not0(this, lnmVar);
                }
                Object obj11 = not0Var.a;
                int i23 = not0Var.b;
                if (i23 == 0) {
                    hm5.M(obj11);
                    vr20 vr20Var8 = (vr20) obj3;
                    czl1 czl1Var = (czl1) obj;
                    if (((mot0) obj2).a && !czl1Var.b) {
                        z4 = true;
                    }
                    Boolean boolValueOf4 = Boolean.valueOf(z4);
                    not0Var.b = 1;
                    if (vr20Var8.emit(boolValueOf4, not0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i23 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj11);
                }
                return rih1Var;
            case 11:
                if (lnmVar instanceof gxt0) {
                    gxt0Var = (gxt0) lnmVar;
                    int i24 = gxt0Var.b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        gxt0Var.b = i24 - Integer.MIN_VALUE;
                    } else {
                        gxt0Var = new gxt0(this, lnmVar);
                    }
                } else {
                    gxt0Var = new gxt0(this, lnmVar);
                }
                Object obj12 = gxt0Var.a;
                int i25 = gxt0Var.b;
                if (i25 == 0) {
                    hm5.M(obj12);
                    vr20 vr20Var9 = (vr20) obj3;
                    i1r i1rVar = (k1r) obj;
                    i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                    if (i1rVar2 != null && (ext0Var = (ext0) i1rVar2.a) != null) {
                        boolean z6 = ((jxt0) obj2).c.b;
                        cxt0 cxt0Var = cxt0.a;
                        if ((z6 && u890.j(ext0Var.a, Boolean.TRUE)) || (ktlVar = ext0Var.b) == ktl.c) {
                            objB = cxt0Var;
                        } else if (ktlVar == ktl.b) {
                            objB = cxt0.b;
                        }
                    }
                    if (objB != null) {
                        gxt0Var.b = 1;
                        if (vr20Var9.emit(objB, gxt0Var) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i25 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj12);
                }
                return rih1Var;
            case 12:
                Object objEmit = ((vr20) obj3).emit(new v0u0((jo70) obj2, (jo70) obj), lnmVar);
                return objEmit == d9nVar ? objEmit : rih1Var;
            case 13:
                g1u0 g1u0Var = (g1u0) obj3;
                Object objY = fn31.Y(w0h1.h(g1u0Var.i), new rwm0(g1u0Var, (x0u0) obj2, (w0u0) obj, (lnm) null, (byte) 20), lnmVar);
                return objY == d9nVar ? objY : rih1Var;
            case 14:
                if (lnmVar instanceof b8u0) {
                    b8u0Var = (b8u0) lnmVar;
                    int i26 = b8u0Var.b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        b8u0Var.b = i26 - Integer.MIN_VALUE;
                    } else {
                        b8u0Var = new b8u0(this, lnmVar);
                    }
                } else {
                    b8u0Var = new b8u0(this, lnmVar);
                }
                Object obj13 = b8u0Var.a;
                int i27 = b8u0Var.b;
                if (i27 == 0) {
                    hm5.M(obj13);
                    vr20 vr20Var10 = (vr20) obj3;
                    if (((Boolean) obj).booleanValue() && ((c8u0) obj2).a.l()) {
                        z3 = true;
                    }
                    Boolean boolValueOf5 = Boolean.valueOf(z3);
                    b8u0Var.b = 1;
                    if (vr20Var10.emit(boolValueOf5, b8u0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i27 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj13);
                }
                return rih1Var;
            case 15:
                if (lnmVar instanceof zbu0) {
                    zbu0Var = (zbu0) lnmVar;
                    int i28 = zbu0Var.b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        zbu0Var.b = i28 - Integer.MIN_VALUE;
                    } else {
                        zbu0Var = new zbu0(this, lnmVar);
                    }
                } else {
                    zbu0Var = new zbu0(this, lnmVar);
                }
                Object obj14 = zbu0Var.a;
                int i29 = zbu0Var.b;
                if (i29 == 0) {
                    hm5.M(obj14);
                    vr20 vr20Var11 = (vr20) obj3;
                    i091 i091Var = (i091) obj;
                    long j = ((uvg1) obj2).c;
                    Float f = (i091Var == null || j <= 0) ? new Float(0.0f) : new Float(yoi1.o(i091Var.d / j, 0.0f, 1.0f));
                    zbu0Var.b = 1;
                    if (vr20Var11.emit(f, zbu0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i29 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj14);
                }
                return rih1Var;
            case 16:
                if (lnmVar instanceof mdu0) {
                    mdu0Var = (mdu0) lnmVar;
                    int i30 = mdu0Var.b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        mdu0Var.b = i30 - Integer.MIN_VALUE;
                    } else {
                        mdu0Var = new mdu0(this, lnmVar);
                    }
                } else {
                    mdu0Var = new mdu0(this, lnmVar);
                }
                Object obj15 = mdu0Var.a;
                int i31 = mdu0Var.b;
                if (i31 == 0) {
                    hm5.M(obj15);
                    mmr0 mmr0Var2 = (mmr0) obj;
                    g790 g790Var = new g790(((odu0) obj2).b.b(), ((Boolean) mmr0Var2.a).booleanValue(), u890.j((String) mmr0Var2.b, "driving-jumpstart"));
                    mdu0Var.b = 1;
                    if (((vr20) obj3).emit(g790Var, mdu0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i31 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj15);
                }
                return rih1Var;
            case 17:
                tka0 tka0Var = (tka0) ((phi0) obj2).b;
                if (lnmVar instanceof teu0) {
                    teu0Var = (teu0) lnmVar;
                    int i32 = teu0Var.b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        teu0Var.b = i32 - Integer.MIN_VALUE;
                    } else {
                        teu0Var = new teu0(this, lnmVar);
                    }
                } else {
                    teu0Var = new teu0(this, lnmVar);
                }
                Object obj16 = teu0Var.a;
                int i33 = teu0Var.b;
                if (i33 == 0) {
                    hm5.M(obj16);
                    vr20 vr20Var12 = (vr20) obj3;
                    spq0 spq0VarSleepTimer = ((PlayerState) obj).sleepTimer();
                    SleepTimer sleepTimer = spq0VarSleepTimer != null ? (SleepTimer) spq0VarSleepTimer.h() : null;
                    if (tka0Var.m(sleepTimer)) {
                        cwl1.l(tka0Var, sleepTimer);
                        objB = sleepTimer;
                    }
                    teu0Var.b = 1;
                    if (vr20Var12.emit(objB, teu0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i33 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj16);
                }
                return rih1Var;
            case 18:
                if (lnmVar instanceof lou0) {
                    lou0Var = (lou0) lnmVar;
                    int i34 = lou0Var.b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        lou0Var.b = i34 - Integer.MIN_VALUE;
                    } else {
                        lou0Var = new lou0(this, lnmVar);
                    }
                } else {
                    lou0Var = new lou0(this, lnmVar);
                }
                Object obj17 = lou0Var.a;
                int i35 = lou0Var.b;
                if (i35 == 0) {
                    hm5.M(obj17);
                    vr20 vr20Var13 = (vr20) obj3;
                    i1r i1rVar3 = (k1r) obj;
                    i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                    if (i1rVar4 == null || (list = (List) i1rVar4.a) == null) {
                        list = z6x.a;
                    }
                    for (Object obj18 : list) {
                        if (u890.j(((pvc0) obj18).c, ((jou0) obj2).a)) {
                            objB = obj18;
                            pvc0Var = (pvc0) objB;
                            if (pvc0Var != null && (str2 = pvc0Var.a) != null) {
                                str3 = str2;
                            }
                            lou0Var.b = 1;
                            if (vr20Var13.emit(str3, lou0Var) == d9nVar) {
                                return d9nVar;
                            }
                        }
                    }
                    pvc0Var = (pvc0) objB;
                    if (pvc0Var != null) {
                        str3 = str2;
                    }
                    lou0Var.b = 1;
                    if (vr20Var13.emit(str3, lou0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i35 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj17);
                }
                return rih1Var;
            case 19:
                jnd0 jnd0Var = (jnd0) obj3;
                hoj0 hoj0VarC = ((ioj0) obj).c(l1z.class, (String) ((j7s) obj2).f);
                if (hoj0VarC != null && (goj0VarA = hoj0VarC.a()) != null && (l1zVar = (l1z) goj0VarA.a) != null) {
                    objB = l1zVar.c;
                }
                Object objA = jnd0Var.a(objB, lnmVar);
                return objA == d9nVar ? objA : rih1Var;
            case 20:
                i091 i091Var2 = (i091) obj;
                ((pdw0) obj2).Q0 = i091Var2;
                Object objEmit2 = ((vr20) obj3).emit(new iew0(i091Var2), lnmVar);
                return objEmit2 == d9nVar ? objEmit2 : rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                fgl fglVar = (fgl) obj;
                String str5 = fglVar.b.b;
                ofw0 ofw0Var = (ofw0) obj3;
                String str6 = ((sbw0) obj2).d.b.e;
                if (!u890.j(str5, str6 != null ? str6 : "")) {
                    return rih1Var;
                }
                int iC = l1d.C(fglVar.a);
                if (iC == 0) {
                    ofw0Var.k(udw0.a);
                    return rih1Var;
                }
                if (iC == 1) {
                    ofw0Var.k(eew0.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 22:
                if (lnmVar instanceof vpw0) {
                    vpw0Var = (vpw0) lnmVar;
                    int i36 = vpw0Var.b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        vpw0Var.b = i36 - Integer.MIN_VALUE;
                    } else {
                        vpw0Var = new vpw0(this, lnmVar);
                    }
                } else {
                    vpw0Var = new vpw0(this, lnmVar);
                }
                Object obj19 = vpw0Var.a;
                int i37 = vpw0Var.b;
                if (i37 == 0) {
                    hm5.M(obj19);
                    vr20 vr20Var14 = (vr20) obj3;
                    ea6 ea6Var = (ea6) obj;
                    if (((wpw0) obj2).e.contains(ea6Var.a) && ((l2r0Var = ea6Var.b) == l2r0.a || l2r0Var == l2r0.b)) {
                        z2 = true;
                    }
                    Boolean boolValueOf6 = Boolean.valueOf(z2);
                    vpw0Var.b = 1;
                    if (vr20Var14.emit(boolValueOf6, vpw0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i37 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj19);
                }
                return rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return b(obj, lnmVar);
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof qdx0) {
                    qdx0Var = (qdx0) lnmVar;
                    int i38 = qdx0Var.b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        qdx0Var.b = i38 - Integer.MIN_VALUE;
                    } else {
                        qdx0Var = new qdx0(this, lnmVar);
                    }
                } else {
                    qdx0Var = new qdx0(this, lnmVar);
                }
                Object obj20 = qdx0Var.a;
                int i39 = qdx0Var.b;
                if (i39 == 0) {
                    hm5.M(obj20);
                    vr20 vr20Var15 = (vr20) obj3;
                    Map map = (Map) obj;
                    List list3 = ((sdx0) obj2).f;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        odx0 odx0Var = (odx0) map.get((String) it.next());
                        if (odx0Var != null) {
                            arrayList.add(odx0Var);
                        }
                    }
                    qdx0Var.b = 1;
                    if (vr20Var15.emit(arrayList, qdx0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i39 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj20);
                }
                return rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return c(obj, lnmVar);
            case 26:
                return e(obj, lnmVar);
            case 27:
                return f(obj, lnmVar);
            case 28:
                return g(obj, lnmVar);
            default:
                if (lnmVar instanceof ozy0) {
                    ozy0Var = (ozy0) lnmVar;
                    int i40 = ozy0Var.b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        ozy0Var.b = i40 - Integer.MIN_VALUE;
                    } else {
                        ozy0Var = new ozy0(this, lnmVar);
                    }
                } else {
                    ozy0Var = new ozy0(this, lnmVar);
                }
                Object objA2 = ozy0Var.a;
                int i41 = ozy0Var.b;
                gax gaxVar = iax.a;
                if (i41 == 0) {
                    hm5.M(objA2);
                    vr20Var2 = (vr20) obj3;
                    q5l q5lVar = (r5l) obj;
                    if (!(q5lVar instanceof o5l) && !(q5lVar instanceof p5l)) {
                        if (q5lVar instanceof q5l) {
                            bah1 bah1Var = (bah1) ((kdy0) obj2).d;
                            String str7 = q5lVar.a;
                            ozy0Var.c = vr20Var2;
                            ozy0Var.d = 0;
                            ozy0Var.b = 1;
                            objA2 = bah1Var.a(str7, ozy0Var);
                            if (objA2 == d9nVar) {
                                return d9nVar;
                            }
                            ndh0Var = (ndh0) objA2;
                            if (ndh0Var instanceof ldh0) {
                                gaxVar = new gax(new Integer(2131961972), (String) null);
                            } else if (ndh0Var instanceof mdh0) {
                                eg.o();
                            } else if (((mdh0) ndh0Var).a < 5) {
                                gaxVar = new gax(new Integer(2131961953), (String) null);
                            }
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    ozy0Var.c = null;
                    ozy0Var.d = i;
                    ozy0Var.b = 2;
                    if (vr20Var2.emit(gaxVar, ozy0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else if (i41 == 1) {
                    i = ozy0Var.d;
                    vr20Var2 = ozy0Var.c;
                    hm5.M(objA2);
                    ndh0Var = (ndh0) objA2;
                    if (ndh0Var instanceof ldh0) {
                        gaxVar = new gax(new Integer(2131961972), (String) null);
                    } else {
                        if (ndh0Var instanceof mdh0) {
                            eg.o();
                            return null;
                        }
                        if (((mdh0) ndh0Var).a < 5) {
                            gaxVar = new gax(new Integer(2131961953), (String) null);
                        }
                    }
                    ozy0Var.c = null;
                    ozy0Var.d = i;
                    ozy0Var.b = 2;
                    if (vr20Var2.emit(gaxVar, ozy0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i41 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(objA2);
                }
                return rih1Var;
        }
    }

    public s4q0(vr20 vr20Var, n2s0 n2s0Var, e3s0 e3s0Var) {
        this.a = (byte) 4;
        this.b = vr20Var;
        this.c = e3s0Var;
    }

    public /* synthetic */ s4q0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
