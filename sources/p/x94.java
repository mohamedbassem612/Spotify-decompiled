package p;

import android.net.Uri;
import android.os.Build;
import android.view.SoundEffectConstants;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import com.spotify.base.java.logging.Logger;
import com.spotify.gander.v2.proto.Notification;
import com.spotify.gander.v2.proto.UserImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x94 implements vu30 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ x94(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(tv80 tv80Var, lnm lnmVar) {
        vds vdsVar;
        if (lnmVar instanceof vds) {
            vdsVar = (vds) lnmVar;
            int i = vdsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vdsVar.c = i - Integer.MIN_VALUE;
            } else {
                vdsVar = new vds(this, lnmVar);
            }
        } else {
            vdsVar = new vds(this, lnmVar);
        }
        Object obj = vdsVar.a;
        int i2 = vdsVar.c;
        if (i2 == 0) {
            hm5.M(obj);
            g6c0 g6c0Var = (g6c0) this.b;
            vdsVar.c = 1;
            Object objA = g6c0Var.a(tv80Var, vdsVar);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(c0h0 c0h0Var, lnm lnmVar) {
        o261 o261Var;
        smc0 smc0VarSingletonList;
        b28 b28Var;
        if (lnmVar instanceof o261) {
            o261Var = (o261) lnmVar;
            int i = o261Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                o261Var.e = i - Integer.MIN_VALUE;
            } else {
                o261Var = new o261(this, lnmVar);
            }
        } else {
            o261Var = new o261(this, lnmVar);
        }
        Object obj = o261Var.c;
        int i2 = o261Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            b28 b28Var2 = c0h0Var.b;
            if (b28Var2.equals(y18.a)) {
                return new i2h0(c0h0Var.a, b28Var2);
            }
            if (b28Var2 instanceof b28) {
                b28 b28Var3 = b28Var2;
                String str = b28Var3.a;
                o261Var.a = c0h0Var;
                o261Var.b = b28Var3;
                o261Var.e = 1;
                Object objE = e(str, o261Var);
                Object obj2 = d9n.a;
                if (objE == obj2) {
                    return obj2;
                }
                obj = objE;
                b28Var = b28Var2;
            } else if (b28Var2 instanceof c28) {
                smc0VarSingletonList = Collections.singletonList(new drl("I couldn't find anything. Try again?"));
            } else if (b28Var2.equals(z18.a)) {
                smc0VarSingletonList = Collections.singletonList(new drl("Something went wrong. Try again?"));
            } else if (b28Var2.equals(a28.a)) {
                smc0VarSingletonList = Collections.singletonList(new drl("Recognition was interrupted. Try again?"));
            } else {
                if (!b28Var2.equals(d28.a)) {
                    eg.o();
                    return null;
                }
                smc0VarSingletonList = Collections.singletonList(new drl("To recognize music, enable microphone access in Android settings and try again."));
            }
            xv2 xv2Var = new xv2(c0h0Var.c, mqo1.A((Iterable) smc0VarSingletonList), false, true, (String) null, 0L);
            long j = c0h0Var.a;
            String str2 = c0h0Var.c;
            return new h2h0(j, new o7h0(xv2Var, new m8r(str2, fg91.b), str2));
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b28Var = o261Var.b;
        c0h0Var = o261Var.a;
        hm5.M(obj);
        m28 m28Var = (m28) obj;
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(new drl(m28Var != null ? cy30.p("You’re listening to ", m28Var.a, " by ", o7h.y0(m28Var.b, ", ", (String) null, (String) null, (iu30) null, 62), ".") : "Found it, but I couldn't load the track details."));
        if (m28Var != null) {
            smc0VarN.add(new frl(6, (String) null, mqo1.s(new String[]{b28Var.a})));
        }
        smc0VarSingletonList = k4p1.k(smc0VarN);
        xv2 xv2Var2 = new xv2(c0h0Var.c, mqo1.A((Iterable) smc0VarSingletonList), false, true, (String) null, 0L);
        long j2 = c0h0Var.a;
        String str3 = c0h0Var.c;
        return new h2h0(j2, new o7h0(xv2Var2, new m8r(str3, fg91.b), str3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(String str, onm onmVar) {
        p261 p261Var;
        jo70 jo70Var;
        List listJ0;
        List list;
        String str2;
        if (onmVar instanceof p261) {
            p261Var = (p261) onmVar;
            int i = p261Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                p261Var.d = i - Integer.MIN_VALUE;
            } else {
                p261Var = new p261(this, onmVar);
            }
        } else {
            p261Var = new p261(this, onmVar);
        }
        Object objO = p261Var.b;
        int i2 = p261Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                lc41 lc41Var = new lc41(this, str, (lnm) null, (byte) 22);
                p261Var.a = str;
                p261Var.d = 1;
                objO = rc2.O(3000L, lc41Var, p261Var);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = p261Var.a;
                hm5.M(objO);
            }
            jo70Var = (jo70) objO;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Failed to resolve audio recognition metadata for URI: %s", new Object[]{str});
            jo70Var = null;
        }
        String string = (jo70Var == null || (str2 = jo70Var.a) == null) ? null : ihc1.e1(str2).toString();
        if (string == null) {
            string = "";
        }
        if (jo70Var == null || (list = jo70Var.d) == null) {
            listJ0 = null;
        } else {
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(ihc1.e1(((ho70) it.next()).a).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            listJ0 = o7h.j0(arrayList2);
        }
        if (listJ0 == null) {
            listJ0 = z6x.a;
        }
        if (string.length() <= 0 || listJ0.isEmpty()) {
            return null;
        }
        return new m28(string, listJ0);
    }

    public final Object invoke(Object obj, Object obj2) {
        vmo0 qmo0Var;
        byte b = this.a;
        pw31 pw31Var = pw31.a;
        kuw0 kuw0Var = h36.b;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                int i = ((yx20) obj).a;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Integer numC = uy20.c(i);
                if (numC != null) {
                    int iIntValue = numC.intValue();
                    ((ha4) obj3).playSoundEffect(Build.VERSION.SDK_INT >= 31 ? uh5.a.a(iIntValue, zBooleanValue) : SoundEffectConstants.getContantForFocusDirection(iIntValue));
                }
                return rih1Var;
            case 1:
                return (bg50) yzj.O0.invoke((qpb0) obj, ((List) obj3).get(((Number) obj2).intValue()));
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                yu3 yu3Var = (yu3) obj3;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String strQ = bno1.q(x340Var2, 2131957967);
                    qim0 qim0Var = (qim0) yu3Var.c;
                    zzq0 zzq0Var = gi3.a;
                    qim0 qim0VarU = u291.u(qim0Var, 280.0f, 0.0f, 560.0f, 0.0f, 10);
                    boolean zG = x340Var2.g(strQ);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new jfa(strQ, (byte) 2);
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarThen = qim0VarU.then(s161.b(nim0Var, false, (iu30) objT));
                    gfh0 gfh0VarC = t1c.c(een.d, true);
                    int iK = tgp1.k(x340Var2);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarThen);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    llj lljVar = y580.R0;
                    if (x340Var2.S || !u890.j(x340Var2.T(), Integer.valueOf(iK))) {
                        z5c.f(iK, x340Var2, iK, lljVar);
                    }
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    dv20.l(0, (j2i) yu3Var.e, x340Var2, true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 3:
                return a((tv80) obj, (lnm) obj2);
            case 4:
                x340 x340Var3 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    fra fraVar = een.N0;
                    xu30 xu30Var = ((i191) obj3).g;
                    jw31 jw31VarA = ew31.a(kuw0Var, fraVar, x340Var4, 54);
                    int iK2 = tgp1.k(x340Var4);
                    xos0 xos0VarM2 = x340Var4.m();
                    qim0 qim0VarE2 = zr7.E(x340Var4, nim0Var);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(jw31VarA, x340Var4, y580.O0);
                    nko1.H(xos0VarM2, x340Var4, y580.N0);
                    llj lljVar2 = y580.R0;
                    if (x340Var4.S || !u890.j(x340Var4.T(), Integer.valueOf(iK2))) {
                        z5c.f(iK2, x340Var4, iK2, lljVar2);
                    }
                    nko1.H(qim0VarE2, x340Var4, y580.Y);
                    xu30Var.invoke(pw31Var, x340Var4, 6);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var5 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    fra fraVar2 = een.N0;
                    j2i j2iVar = ((szg1) obj3).j;
                    jw31 jw31VarA2 = ew31.a(kuw0Var, fraVar2, x340Var6, 54);
                    int iK3 = tgp1.k(x340Var6);
                    xos0 xos0VarM3 = x340Var6.m();
                    qim0 qim0VarE3 = zr7.E(x340Var6, nim0Var);
                    hzj.A.getClass();
                    if (x340Var6.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(jw31VarA2, x340Var6, y580.O0);
                    nko1.H(xos0VarM3, x340Var6, y580.N0);
                    llj lljVar3 = y580.R0;
                    if (x340Var6.S || !u890.j(x340Var6.T(), Integer.valueOf(iK3))) {
                        z5c.f(iK3, x340Var6, iK3, lljVar3);
                    }
                    nko1.H(qim0VarE3, x340Var6, y580.Y);
                    j2iVar.invoke(pw31Var, x340Var6, 6);
                    x340Var6.r(true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 6:
                r3d r3dVar = (r3d) obj3;
                List list = ((nzg0) obj).a;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Uri) it.next()).toString());
                }
                r3dVar.e(arrayList);
                return rih1Var;
            case 7:
                int iIntValue5 = ((Number) obj2).intValue();
                return (bg50) gft.b1.invoke((qpb0) obj, Integer.valueOf(iIntValue5), ((ArrayList) obj3).get(iIntValue5));
            case 8:
                x340 x340Var7 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    Object objT2 = x340Var8.T();
                    if (objT2 == fkj0.X) {
                        objT2 = new g6f0((byte) 4);
                        x340Var8.s0(objT2);
                    }
                    qim0 qim0VarB = s161.b(nim0Var, false, (iu30) objT2);
                    ven0 ven0Var = (ven0) obj3;
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iK4 = tgp1.k(x340Var8);
                    xos0 xos0VarM4 = x340Var8.m();
                    qim0 qim0VarE4 = zr7.E(x340Var8, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var8.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var8.m0();
                    if (x340Var8.S) {
                        x340Var8.l(n4kVar);
                    } else {
                        x340Var8.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var8, y580.O0);
                    nko1.H(xos0VarM4, x340Var8, y580.N0);
                    llj lljVar4 = y580.R0;
                    if (x340Var8.S || !u890.j(x340Var8.T(), Integer.valueOf(iK4))) {
                        z5c.f(iK4, x340Var8, iK4, lljVar4);
                    }
                    nko1.H(qim0VarE4, x340Var8, y580.Y);
                    us71.j(0, (vu30) ven0Var.getValue(), x340Var8, true);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 9:
                Notification notification = (Notification) obj;
                String str = (String) obj2;
                String id = notification.getId();
                mxe1 mxe1Var = (mxe1) ((p5) obj3).invoke(notification.o());
                String title = notification.getTitle();
                pjo0 pjo0Var = new pjo0(notification.n().getUri(), v80.valueOf(notification.n().o().name()));
                int iQ = notification.q();
                int i2 = iQ == 0 ? -1 : wno0.a[l1d.C(iQ)];
                if (i2 != 1) {
                    qmo0Var = (i2 == 2 || i2 != 3) ? new nmo0(notification.p().getImageUrl(), notification.p().o()) : new umo0(new ybi1(notification.u().p().getImageUrl(), notification.u().p().o()), new nmo0(notification.u().o().getImageUrl(), notification.u().o().o()));
                } else {
                    h290<UserImage> h290VarP = notification.s().p();
                    ArrayList arrayList2 = new ArrayList(q7h.U(h290VarP, 10));
                    for (UserImage userImage : h290VarP) {
                        arrayList2.add(new ybi1(userImage.getImageUrl(), userImage.o()));
                    }
                    qmo0Var = new qmo0(arrayList2);
                }
                return new kjo0(id, mxe1Var, title, pjo0Var, qmo0Var, notification.getIsNew(), notification.t(), new bdj0(notification.r().o(), notification.r().getMessageId()), str);
            case 10:
                return d((c0h0) obj, (lnm) obj2);
            default:
                x340 x340Var9 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    q9e1.c((String) obj3, (qim0) null, 0L, 0L, (FontWeight) null, (FontFamily) null, 0L, (a0e1) null, 0L, 0, false, 0, 0, (lee1) null, x340Var10, 0, 0, 262142);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
        }
    }
}
