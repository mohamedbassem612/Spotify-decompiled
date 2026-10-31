package p;

import android.content.Context;
import android.net.Uri;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.base.java.logging.Logger;
import com.spotify.externalintegration.ubi.UbiSpecificationId;
import com.spotify.metadata.esperanto.proto.GetEntityRequest;
import com.spotify.metadata.proto.Metadata;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zeu implements hhd1, brw, h0x {
    public final Object a;
    public Object b;
    public Object c;

    public zeu(xrc0 xrc0Var, zpv zpvVar) {
        this.a = xrc0Var;
        this.b = zpvVar;
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.R();
        sku0VarP.Z();
        sku0VarP.k0();
        sku0VarP.a0();
        sku0VarP.G();
        hru0VarS.x(sku0VarP);
        this.c = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
    }

    public static final /* synthetic */ iu30 b(zeu zeuVar) {
        return (w3w) zeuVar.b;
    }

    public static final /* synthetic */ pnc1 d(zeu zeuVar) {
        return (pnc1) zeuVar.c;
    }

    public static fpd f(fpd fpdVar, apd apdVar) {
        dpd dpdVar = fpdVar instanceof dpd ? (dpd) fpdVar : null;
        if (dpdVar == null) {
            return fpdVar;
        }
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(apdVar);
        smc0VarN.addAll(dpdVar.b);
        return dpd.e(dpdVar, (String) null, k4p1.k(smc0VarN), 1021);
    }

    public static boolean k(Editable editable, KeyEvent keyEvent, boolean z) {
        b2h1[] b2h1VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (b2h1VarArr = (b2h1[]) editable.getSpans(selectionStart, selectionEnd, b2h1.class)) != null && b2h1VarArr.length > 0) {
                for (b2h1 b2h1Var : b2h1VarArr) {
                    int spanStart = editable.getSpanStart(b2h1Var);
                    int spanEnd = editable.getSpanEnd(b2h1Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean n(h4x h4xVar, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z2) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z2) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z2 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i2, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z3) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                b2h1[] b2h1VarArr = (b2h1[]) editable.getSpans(selectionStart, iMin, b2h1.class);
                if (b2h1VarArr != null && b2h1VarArr.length > 0) {
                    for (b2h1 b2h1Var : b2h1VarArr) {
                        int spanStart = editable.getSpanStart(b2h1Var);
                        int spanEnd = editable.getSpanEnd(b2h1Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    h4xVar.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    h4xVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public void a(dhd1 dhd1Var, int i) {
        String str;
        TextView textViewN;
        ito itoVar;
        fai0 fai0Var = (fai0) this.a;
        List list = (List) fai0Var.e();
        if (list == null || (itoVar = (ito) o7h.t0(i, list)) == null || (str = itoVar.a) == null) {
            str = "";
        }
        dhd1Var.a(str);
        xzo1.s(dhd1Var);
        if (i == ((ViewPager2) ((lvc1) this.b).d).getCurrentItem() && (textViewN = xzo1.n(dhd1Var)) != null) {
            textViewN.setTextAppearance(2132018004);
        }
        dhd1Var.e.setOnClickListener(new kw6(fai0Var, dhd1Var, (teb) this.c, (byte) 7));
    }

    @Override // p.h0x
    public List c(boolean z, vu30 vu30Var) {
        a1x a1xVar = (a1x) this.a;
        adp adpVar = a1xVar.b;
        String str = (String) this.b;
        oaj1 oaj1Var = new oaj1(vu30Var, null, 5);
        iac0 iac0Var = (iac0) this.c;
        return p7h.M(new dsw[]{adpVar.a(new qaj1(str, oaj1Var, iac0Var), new lbj1(str, new jbj1(1, 1), new kbj1(new s55(2, (lnm) null, (byte) 10), vu30Var), iac0Var), false), a1xVar.d.a(new uxb0(2, false)), a1xVar.c.a(new aiu(new zhu(1, vu30Var), iac0Var, 1, z))});
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object g(j0k0 j0k0Var, onm onmVar) {
        ffv ffvVar;
        Object objA;
        j0k0 j0k0Var2 = j0k0Var;
        if (onmVar instanceof ffv) {
            ffvVar = (ffv) onmVar;
            int i = ffvVar.d;
            if ((i & os00.INVALID_ID) != 0) {
                ffvVar.d = i - os00.INVALID_ID;
            } else {
                ffvVar = new ffv(this, onmVar);
            }
        } else {
            ffvVar = new ffv(this, onmVar);
        }
        Object obj = ffvVar.b;
        int i2 = ffvVar.d;
        if (i2 == 0) {
            hm5.M(obj);
            lhg1 lhg1Var = u890.j(j0k0Var2.a, j0k0Var2.b) ? null : j0k0Var2.a;
            ack0 ack0Var = (ybk0) this.c;
            cbk0 cbk0Var = (cbk0) this.a;
            String str = cbk0Var.a;
            String str2 = cbk0Var.b.b;
            ffvVar.a = j0k0Var2;
            ffvVar.d = 1;
            objA = ack0Var.a(str, str2, ffvVar, lhg1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j0k0Var2 = ffvVar.a;
            hm5.M(obj);
            objA = ((e331) obj).a;
        }
        if (e331.a(objA) == null) {
            return new s2k0((String) objA, j0k0Var2.c);
        }
        kt91 kt91Var = (kt91) this.b;
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131958682});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        er91 er91Var = new er91((fs91) null, "", 2131958682, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        if (kt91Var.g()) {
            kt91Var.k(er91Var);
        } else {
            kt91Var.o(er91Var);
        }
        return new r2k0(3, j0k0Var2.c);
    }

    /* JADX WARN: Code duplicated, block: B:182:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:216:0x034d  */
    /* JADX WARN: Code duplicated, block: B:230:0x038f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0160  */
    public apd h(u310 u310Var, z3p0 z3p0Var) {
        apd string;
        apd apdVar;
        hvc dvcVar;
        apd mwcVar;
        apd apdVar2;
        apd apdVarValueOf;
        Object next;
        Object next2;
        sqn0 dqn0Var;
        String strA = u310Var.a;
        upp0 upp0Var = (upp0) this.b;
        ((agc0) this.a).getClass();
        if (strA.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || strA.equals("spotify:collection:tracks") || strA.equals("spotify:internal:collection:tracks") || (nhc1.Y(strA, "spotify:user:", false) && nhc1.R(strA, ":collection", false))) {
            strA = "spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ";
        } else {
            upp0Var.getClass();
            if (upp0.b(strA)) {
                strA = upp0.a();
            }
        }
        String strA2 = u310Var.u;
        if (strA2 != null) {
            upp0Var.getClass();
            if (upp0.b(strA2)) {
                strA2 = upp0.a();
            }
        } else {
            strA2 = null;
        }
        u310 u310VarB = u310.b(u310Var, strA, (String) null, (Uri) null, 0, (Double) null, strA2, 0, (y310) null, (String) null, (Map) null, (Uri) null, (q510) null, -8388610, 15);
        apd apdVar3 = u310VarB.u;
        apd apdVar4 = u310VarB.a;
        Uri uri = u310VarB.j;
        if (uri == null || (string = uri.toString()) == null) {
            string = apdVar4;
        }
        Uri uri2 = u310VarB.e;
        int i = u310VarB.H;
        String str = u310VarB.C;
        Uri uri3 = u310VarB.f;
        if (uri2 == null || uri2.equals(Uri.EMPTY) || nhc1.R(uri2.toString(), "placeholder", false)) {
            apdVar = null;
            dvcVar = new dvc((String) string, 2);
        } else if (aai0.a(uri2)) {
            apdVar = null;
            dvcVar = new fvc((Integer) null, uri2.toString(), (mmr0) null, 13);
        } else {
            apdVar = null;
            if (str != null) {
                dvcVar = new cvc(uri2.toString(), str, string);
            } else {
                String string2 = uri2.toString();
                if (i == 3) {
                    i = 0;
                }
                if (i == 0) {
                    i = 2;
                }
                dvcVar = new gvc(string2, string, i, uri3);
            }
        }
        String str2 = u310VarB.c;
        apd lwcVar = str2 != null ? new lwc(str2) : apdVar;
        apd apdVar5 = u310VarB.d;
        if (apdVar5 == null) {
            mwcVar = apdVar;
        } else {
            if (apdVar5.length() <= 0) {
                apdVar5 = apdVar;
            }
            if (apdVar5 != null) {
                xj61 xj61Var = new xj61();
                if (u310VarB.I == 1) {
                    xj61Var.add(en81.e);
                }
                if (u310VarB.l) {
                    xj61Var.add(en81.a);
                }
                if (u310VarB.m) {
                    xj61Var.add(en81.b);
                }
                if (u310VarB.o) {
                    xj61Var.add(en81.d);
                }
                String str3 = u310VarB.z;
                if (str3 != null) {
                    xj61Var.add(new fn81(str3));
                }
                mwcVar = new mwc(apdVar5, cwl1.j(xj61Var));
            } else {
                mwcVar = apdVar;
            }
        }
        int iC = l1d.C(u310VarB.G);
        g80 j80Var = o80.a;
        if (iC == 0) {
            apd apdVar6 = apdVar3 == null ? apdVar4 : apdVar3;
            apd apdVar7 = apdVar3 != null ? apdVar4 : apdVar;
            if (!u890.j(apdVar6, "non-playable-item")) {
                j80Var = new j80(apdVar, apdVar6, apdVar7);
            }
        } else if (iC == 1) {
            Iterator it = a410.c.iterator();
            do {
                if (!it.hasNext()) {
                    next = apdVar;
                    break;
                }
                next = it.next();
            } while (!((a410) next).a.equals(apdVar4));
            a410 a410Var = (a410) next;
            if (a410Var != null) {
                switch (a410Var.ordinal()) {
                    case 0:
                        dqn0Var = lqn0.a;
                        break;
                    case 1:
                        dqn0Var = upn0.a;
                        break;
                    case 2:
                        dqn0Var = cqn0.a;
                        break;
                    case 3:
                        dqn0Var = pqn0.a;
                        break;
                    case 4:
                        dqn0Var = qqn0.a;
                        break;
                    case 5:
                        dqn0Var = uqn0.a;
                        break;
                    case 6:
                        dqn0Var = vqn0.a;
                        break;
                    case 7:
                        dqn0Var = rqn0.a;
                        break;
                    case 8:
                        dqn0Var = sqn0.a;
                        break;
                    case 9:
                        eg.m("Offline is not a valid navigable entity in CAL");
                        return apdVar;
                    default:
                        eg.o();
                        return apdVar;
                }
            } else {
                Iterator it2 = x64.c.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = apdVar;
                        break;
                    }
                    next2 = it2.next();
                } while (!((x64) next2).a.equals(apdVar4));
                x64 x64Var = (x64) next2;
                if (x64Var != null) {
                    int iOrdinal = x64Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            eg.o();
                            return apdVar;
                        }
                        eg.m("Non playable item should never be browsable");
                        return apdVar;
                    }
                    dqn0Var = cqn0.a;
                } else if (upp0.b(apdVar4)) {
                    dqn0Var = new hqn0(apdVar4);
                } else if (apdVar4.equals(nik1.K2.a)) {
                    dqn0Var = new tqn0(apdVar4);
                } else if (!(apdVar4.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || apdVar4.equals("spotify:collection:tracks") || apdVar4.equals("spotify:internal:collection:tracks") || (nhc1.Y(apdVar4, "spotify:user:", false) && nhc1.R(apdVar4, ":collection", false))) || apdVar4.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ")) {
                    Set set = s4b1.f;
                    s4b1 s4b1VarX = uic.x(apdVar4);
                    v5b1 v5b1Var = s4b1VarX.d;
                    if (o7h.i0(s4b1.g, v5b1Var != null ? v5b1Var.getType() : apdVar)) {
                        dqn0Var = new iqn0(apdVar4);
                    } else {
                        if (u890.j(v5b1Var != null ? v5b1Var.getType() : apdVar, bzu0.f)) {
                            dqn0Var = new wpn0(apdVar4);
                        } else {
                            int iOrdinal2 = s4b1VarX.c.ordinal();
                            if (iOrdinal2 == 30) {
                                dqn0Var = new spn0(apdVar4);
                            } else if (iOrdinal2 == 44) {
                                dqn0Var = new tpn0(apdVar4);
                            } else if (iOrdinal2 == 111) {
                                dqn0Var = new xpn0(apdVar4);
                            } else if (iOrdinal2 == 171) {
                                dqn0Var = new spn0(apdVar4);
                            } else if (iOrdinal2 == 173) {
                                dqn0Var = new tpn0(apdVar4);
                            } else if (iOrdinal2 == 190) {
                                dqn0Var = new gqn0(apdVar4);
                            } else if (iOrdinal2 == 844) {
                                dqn0Var = new jqn0(apdVar4);
                            } else if (iOrdinal2 != 860) {
                                Logger.d("[CAL] Unknown navigable entity: ".concat(apdVar4), new Object[0]);
                                dqn0Var = new clv(apdVar4);
                            } else {
                                dqn0Var = new oqn0(apdVar4);
                            }
                        }
                    }
                } else {
                    n57.s("Navigating to LikedSongs using collection URI: ".concat(apdVar4));
                    dqn0Var = new dqn0(apdVar4);
                }
            }
            j80Var = new g80(dqn0Var);
        } else if (iC != 2) {
            eg.o();
            return apdVar;
        }
        g80 g80Var = j80Var;
        if (z3p0Var != null) {
            String str4 = z3p0Var.a;
            if (str4.length() != 0) {
                String str5 = u310VarB.b;
                boolean zEquals = str5 != null ? z3p0Var.c.equals(str5) : true;
                boolean zA = fgr.a(apdVar4, str4);
                boolean z = zEquals && apdVar3 != null && fgr.a(apdVar3, str4) && apdVar4.equals(z3p0Var.b);
                apd apdVar8 = y6x0.T0;
                if (zA || z) {
                    apdVar2 = apdVar8;
                } else {
                    apdVar2 = apdVar;
                }
            } else {
                apdVar2 = apdVar;
            }
        } else {
            apdVar2 = apdVar;
        }
        apd apdVar9 = u310VarB.p;
        if (apdVar9 != null) {
            apd apdVar10 = ((nhc1.Y(apdVar4, "spotify:episode:", false) || nhc1.Y(apdVar4, "spotify:show:", false)) && Math.abs(apdVar9.doubleValue()) <= Double.MAX_VALUE) ? apdVar9 : apdVar;
            if (apdVar10 != null) {
                apdVarValueOf = Float.valueOf(yoi1.o((float) apdVar10.doubleValue(), 0.0f, 1.0f));
            } else {
                apdVarValueOf = apdVar;
            }
        } else {
            apdVarValueOf = apdVar;
        }
        return new apd(lwcVar, mwcVar, dvcVar, g80Var, apdVar2, apdVarValueOf, 144);
    }

    public jhm i(String str, boolean z, g3d0 g3d0Var, qxc0 qxc0Var, Set set) {
        return new jhm("list_edit", qsx.c, (fhm) null, Integer.valueOf(((m980) this.b).b ? 2131960088 : 2131960080), (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(rnv.V0, new wrs(this, str, (byte) 26)), new gdv((byte) 1, this, qxc0Var, set, str, g3d0Var, z)), 244);
    }

    public jhm j(lik1 lik1Var, String str, h2v h2vVar, boolean z, boolean z2, boolean z3) {
        boolean z4 = (h2vVar instanceof g2v) || (h2vVar instanceof e2v) || (h2vVar instanceof c2v);
        return new jhm("list_download_item", z4 ? umx.c : tmx.c, (fhm) null, Integer.valueOf(z4 ? 2131954466 : 2131954365), (String) null, false, z3 ? new tm81(2, 6, "list_download_item", (iu30) null, false) : null, new ihm(new ygm(2), z4 ? hhm.b : hhm.a, new ghm(wvu.X, new cl1(z4, str, (byte) 13)), new sxu(this, lik1Var, z4, h2vVar, str, z, z2)), 116);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object l(onm onmVar) {
        wpv wpvVar;
        zpv zpvVar = (zpv) this.b;
        if (onmVar instanceof wpv) {
            wpvVar = (wpv) onmVar;
            int i = wpvVar.c;
            if ((i & os00.INVALID_ID) != 0) {
                wpvVar.c = i - os00.INVALID_ID;
            } else {
                wpvVar = new wpv(this, onmVar);
            }
        } else {
            wpvVar = new wpv(this, onmVar);
        }
        Object objF = wpvVar.a;
        int i2 = wpvVar.c;
        if (i2 == 0) {
            hm5.M(objF);
            rsc0 rsc0Var = (xrc0) this.a;
            String str = zpvVar.b;
            trc0 trc0Var = (trc0) this.c;
            wpvVar.c = 1;
            objF = rsc0Var.f(str, trc0Var, wpvVar);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        wsc0 wsc0Var = (wsc0) ((py21) objF).d();
        String str2 = zpvVar.b;
        kby kbyVar = wsc0Var.f;
        return new jwq(str2, kbyVar.b, kbyVar.d.a, kbyVar.w.g.c, kbyVar.k, kbyVar.q);
    }

    public int m(int i, CharSequence charSequence) {
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            b2h1[] b2h1VarArr = (b2h1[]) spanned.getSpans(i, i + 1, b2h1.class);
            if (b2h1VarArr.length > 0) {
                return spanned.getSpanStart(b2h1VarArr[0]);
            }
        }
        return ((d5x) s(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Alert.DURATION_SHOW_INDEFINITELY, true, new d5x(i))).b;
    }

    public boolean o(CharSequence charSequence, int i, int i2, a2h1 a2h1Var) {
        if ((a2h1Var.c & 3) == 0) {
            i0s i0sVar = (i0s) this.c;
            mkj0 mkj0VarC = a2h1Var.c();
            int iA = mkj0VarC.a(8);
            if (iA != 0) {
                ((akd1) mkj0VarC).b.getShort(iA + ((akd1) mkj0VarC).a);
            }
            i0sVar.getClass();
            ThreadLocal threadLocal = i0s.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = i0sVar.a.hasGlyph(sb.toString());
            int i3 = a2h1Var.c & 4;
            a2h1Var.c = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (a2h1Var.c & 3) == 2;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0112  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object p(String str, onm onmVar) {
        oow oowVar;
        if (onmVar instanceof oow) {
            oowVar = (oow) onmVar;
            int i = oowVar.c;
            if ((i & os00.INVALID_ID) != 0) {
                oowVar.c = i - os00.INVALID_ID;
            } else {
                oowVar = new oow(this, onmVar);
            }
        } else {
            oowVar = new oow(this, onmVar);
        }
        Object objB = oowVar.a;
        int i2 = oowVar.c;
        if (i2 == 0) {
            hm5.M(objB);
            c610 c610Var = (c610) this.a;
            r9c r9cVar = new r9c((String) null, str, (String) null, (String) null, lro1.r(((Context) this.b).getPackageName()), false, false, (hlr0) null, 3, 2, (UbiSpecificationId) null, false, 255917);
            oowVar.c = 1;
            objB = c610Var.b(r9cVar, oowVar);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        z310 z310Var = (z310) objB;
        List<u310> list = z310Var.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (u310 u310VarB : list) {
            int i3 = u310VarB.J;
            int i4 = 5;
            if (i3 == 0 || i3 == 5) {
                Uri uri = u310VarB.j;
                if (uri != null) {
                    String string = uri.toString();
                    ((agc0) this.c).getClass();
                    if (!string.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") && !string.equals("spotify:collection:tracks") && !string.equals("spotify:internal:collection:tracks") && nhc1.Y(string, "spotify:user:", false)) {
                        nhc1.R(string, ":collection", false);
                    }
                    Set set = s4b1.f;
                    s4b1 s4b1VarX = uic.x(string);
                    v5b1 v5b1Var = s4b1VarX.d;
                    if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                        i4 = 2;
                    } else {
                        int iOrdinal = s4b1VarX.c.ordinal();
                        if (iOrdinal == 30) {
                            i4 = 3;
                        } else if (iOrdinal == 44) {
                            i4 = 1;
                        } else if (iOrdinal == 208) {
                            i4 = 4;
                        } else if (iOrdinal == 659 || iOrdinal == 844 || iOrdinal == 849) {
                            i4 = 6;
                        } else if (iOrdinal == 856 || iOrdinal == 860) {
                            i4 = 4;
                        } else if (iOrdinal == 926) {
                            i4 = 7;
                        }
                        uri.toString();
                        switch (i4) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                break;
                            default:
                                throw null;
                        }
                    }
                }
                u310VarB = u310.b(u310VarB, (String) null, (String) null, (Uri) null, 0, (Double) null, (String) null, i4, (y310) null, (String) null, (Map) null, (Uri) null, (q510) null, -33554433, 15);
            }
            arrayList.add(u310VarB);
        }
        return z310.a(z310Var, arrayList, (f410) null, 14);
    }

    public Single q(String str) {
        ueg uegVar = (ueg) this.b;
        dn40 dn40VarN = GetEntityRequest.n();
        dn40VarN.n(str);
        return uegVar.a(dn40VarN.build());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056 A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:7:0x000f, B:10:0x0014, B:12:0x0018, B:14:0x0025, B:22:0x0046, B:24:0x0050, B:26:0x0053, B:28:0x0056, B:30:0x0066, B:31:0x0069), top: B:64:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0066 A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:7:0x000f, B:10:0x0014, B:12:0x0018, B:14:0x0025, B:22:0x0046, B:24:0x0050, B:26:0x0053, B:28:0x0056, B:30:0x0066, B:31:0x0069), top: B:64:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:? A[SYNTHETIC] */
    public CharSequence r(CharSequence charSequence, int i, int i2, boolean z) throws Throwable {
        akh1 akh1Var;
        CharSequence charSequence2;
        Throwable th;
        int i3;
        int i4;
        cna1 cna1Var;
        b2h1[] b2h1VarArr;
        int spanStart;
        boolean z2 = charSequence instanceof cna1;
        if (z2) {
            ((cna1) charSequence).a();
        }
        if (z2) {
            akh1Var = new akh1((Spannable) charSequence);
            if (akh1Var != null) {
                for (b2h1 b2h1Var : b2h1VarArr) {
                    spanStart = akh1Var.b.getSpanStart(b2h1Var);
                    int spanEnd = akh1Var.b.getSpanEnd(b2h1Var);
                    if (spanStart != i2) {
                        akh1Var.removeSpan(b2h1Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd, i2);
                }
            }
            i3 = i;
            i4 = i2;
            if (i3 == i4) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
                cna1Var = (cna1) charSequence2;
                cna1Var.b();
            } else {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
                cna1Var = (cna1) charSequence2;
                cna1Var.b();
            }
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    akh1Var = new akh1((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((cna1) charSequence2).b();
                    throw th;
                }
            } else if (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, b2h1.class) > i2) {
                akh1Var = null;
            } else {
                akh1Var = new akh1();
                akh1Var.a = false;
                akh1Var.b = new SpannableString(charSequence);
            }
            if (akh1Var != null && (b2h1VarArr = (b2h1[]) akh1Var.b.getSpans(i, i2, b2h1.class)) != null && b2h1VarArr.length > 0) {
                while (i < r4) {
                    spanStart = akh1Var.b.getSpanStart(b2h1Var);
                    int spanEnd2 = akh1Var.b.getSpanEnd(b2h1Var);
                    if (spanStart != i2) {
                        akh1Var.removeSpan(b2h1Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd2, i2);
                }
            }
            i3 = i;
            i4 = i2;
            if (i3 == i4 && i3 < charSequence.length()) {
                jut jutVar = new jut(akh1Var, (ulc) this.a, (byte) 23);
                charSequence2 = charSequence;
                try {
                    akh1 akh1Var2 = (akh1) s(charSequence2, i3, i4, Alert.DURATION_SHOW_INDEFINITELY, z, jutVar);
                    if (akh1Var2 == null) {
                        if (z2) {
                            cna1Var = (cna1) charSequence2;
                        }
                        return charSequence2;
                    }
                    Spannable spannable = akh1Var2.b;
                    if (z2) {
                        ((cna1) charSequence2).b();
                    }
                    return spannable;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((cna1) charSequence2).b();
                    throw th;
                }
            }
            charSequence2 = charSequence;
            if (!z2) {
                return charSequence2;
            }
            cna1Var = (cna1) charSequence2;
            cna1Var.b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z2) {
            throw th;
        }
        ((cna1) charSequence2).b();
        throw th;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:6:0x0018
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public java.lang.Object s(java.lang.CharSequence r9, int r10, int r11, int r12, boolean r13, p.c5x r14) {
        /*
            r8 = this;
            p.e5x r0 = new p.e5x
            java.lang.Object r1 = r8.b
            p.zsc r1 = (p.zsc) r1
            java.lang.Object r1 = r1.d
            p.slj0 r1 = (p.slj0) r1
            r0.<init>(r1)
            int r1 = java.lang.Character.codePointAt(r9, r10)
            r2 = 0
            r3 = 1
            r4 = r2
            r5 = r3
        L15:
            r2 = r1
        L16:
            r1 = r10
        L17:
            r6 = 2
            if (r10 >= r11) goto L5f
            if (r4 >= r12) goto L5f
            if (r5 == 0) goto L5f
            int r7 = r0.a(r2)
            if (r7 == r3) goto L4f
            if (r7 == r6) goto L41
            r6 = 3
            if (r7 == r6) goto L2a
            goto L17
        L2a:
            if (r13 != 0) goto L36
            p.slj0 r6 = r0.d
            p.a2h1 r6 = r6.b
            boolean r6 = r8.o(r9, r1, r10, r6)
            if (r6 != 0) goto L16
        L36:
            p.slj0 r5 = r0.d
            p.a2h1 r5 = r5.b
            boolean r5 = r14.c(r9, r1, r10, r5)
            int r4 = r4 + 1
            goto L16
        L41:
            int r6 = java.lang.Character.charCount(r2)
            int r6 = r6 + r10
            if (r6 >= r11) goto L4d
            int r10 = java.lang.Character.codePointAt(r9, r6)
            r2 = r10
        L4d:
            r10 = r6
            goto L17
        L4f:
            int r10 = java.lang.Character.codePointAt(r9, r1)
            int r10 = java.lang.Character.charCount(r10)
            int r10 = r10 + r1
            if (r10 >= r11) goto L16
            int r1 = java.lang.Character.codePointAt(r9, r10)
            goto L15
        L5f:
            byte r11 = r0.a
            if (r11 != r6) goto L8a
            p.slj0 r11 = r0.c
            p.a2h1 r11 = r11.b
            if (r11 == 0) goto L8a
            int r11 = r0.f
            if (r11 > r3) goto L73
            boolean r11 = r0.c()
            if (r11 == 0) goto L8a
        L73:
            if (r4 >= r12) goto L8a
            if (r5 == 0) goto L8a
            if (r13 != 0) goto L83
            p.slj0 r11 = r0.c
            p.a2h1 r11 = r11.b
            boolean r8 = r8.o(r9, r1, r10, r11)
            if (r8 != 0) goto L8a
        L83:
            p.slj0 r8 = r0.c
            p.a2h1 r8 = r8.b
            r14.c(r9, r1, r10, r8)
        L8a:
            java.lang.Object r8 = r14.getResult()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zeu.s(java.lang.CharSequence, int, int, int, boolean, p.c5x):java.lang.Object");
    }

    public void start() {
        ((moy0) this.a).subscribe(new crw(this));
    }

    public void stop() {
        pnc1 pnc1Var = (pnc1) this.c;
        if (pnc1Var != null) {
            pnc1Var.cancel();
        }
    }

    public Single t(String str) {
        if (nik1.p.a(str)) {
            return q(str).map(new lmw(this, (byte) 4));
        }
        if (nik1.M.a(str)) {
            return q(str).map(new lqr(this, (byte) 26));
        }
        if (nik1.N.a(str)) {
            return q(str).map(new dqu(this, (byte) 8));
        }
        if (nik1.F.a(str)) {
            return rqt0.F(o6x.a, new ymu(this, str, (lnm) null, (byte) 19)).flatMap(new fey((Object) this, (byte) 0));
        }
        Single singleJust = Single.just("");
        singleJust.getClass();
        return singleJust;
    }

    public String u(Metadata.ImageGroup imageGroup) {
        if (imageGroup.getImageCount() <= 0) {
            return "";
        }
        String string = p370.a(y6b1.i(zno1.z(imageGroup.o().n().t())).toString()).toString();
        string.getClass();
        return string;
    }

    public void v(ou80 ou80Var) {
        fn31.T((llm) this.c, null, 0, new ymu(this, ou80Var, (lnm) null, (byte) 4), 3);
    }

    public /* synthetic */ zeu(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ zeu(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj4;
    }

    public zeu(gdy gdyVar) {
        this.a = gdyVar;
        this.b = new idd1(new hdy(this, (byte) 0));
        this.c = new idd1(new hdy(this, (byte) 1));
    }

    public zeu() {
        this.a = new CopyOnWriteArraySet();
        this.b = new CopyOnWriteArraySet();
        this.c = Observable.create(new lqr(this, (byte) 24));
    }

    public zeu(q7r0 q7r0Var, i8h1 i8h1Var) {
        this.a = q7r0Var;
        this.b = i8h1Var;
        r6h1 r6h1Var = r6h1.c;
        this.c = new rrk0((byte) 5);
    }

    public zeu(moy0 moy0Var, w3w w3wVar) {
        this.a = moy0Var;
        this.b = w3wVar;
    }

    public zeu(cbk0 cbk0Var, ybk0 ybk0Var, kt91 kt91Var) {
        this.a = cbk0Var;
        this.c = ybk0Var;
        this.b = kt91Var;
    }

    public /* synthetic */ zeu(LinearLayout linearLayout, View view, View view2, TextView textView) {
        this.a = view;
        this.b = view2;
        this.c = textView;
    }

    public zeu(xrc0 xrc0Var, p370 p370Var, ueg uegVar) {
        this.a = xrc0Var;
        this.b = uegVar;
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.Z();
        hru0VarS.x(sku0VarP);
        this.c = hru0VarS.build();
    }

    public zeu(kt91 kt91Var, z4q z4qVar, ayl aylVar) {
        this.b = kt91Var;
        this.a = z4qVar;
        this.c = aylVar;
    }

    public zeu(dn3 dn3Var) {
        this.a = dn3Var;
    }

    public zeu(zsc zscVar, ulc ulcVar, i0s i0sVar, Set set) {
        this.a = ulcVar;
        this.b = zscVar;
        this.c = i0sVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            s(str, 0, str.length(), 1, true, new jm(str, (byte) 2));
        }
    }
}
