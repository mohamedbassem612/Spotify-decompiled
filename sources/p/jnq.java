package p;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.daylistsharing.sharingimpl.proto.ShareCard;
import com.spotify.daylistsharing.sharingimpl.proto.ShareData;
import io.reactivex.rxjava3.core.Completable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jnq implements hj71 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public jnq(Context context) {
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624501, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = constraintLayoutInflate;
        int i = 2131428401;
        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131428401);
        if (textView != null) {
            i = 2131429140;
            TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131429140);
            if (textView2 != null) {
                i = 2131429984;
                TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131429984);
                if (textView3 != null) {
                    i = 2131430868;
                    TextView textView4 = (TextView) m5n1.t(constraintLayoutInflate, 2131430868);
                    if (textView4 != null) {
                        g1i g1iVar = new g1i(constraintLayout, textView, textView2, textView3, textView4, (byte) 5);
                        eqq.t(-1, -2, constraintLayout);
                        this.c = g1iVar;
                        this.a = r4u.c(new r4u[]{r4u.d(new nwj(grr.b, (byte) 1), r4u.a(new lqr(this, (byte) 1))), r4u.d(new nwj(hrr.b, (byte) 1), r4u.a(new a0m(this, (byte) 14))), r4u.d(new nwj(irr.b, (byte) 1), r4u.a(new wcr(this, (byte) 6))), r4u.d(new nwj(jrr.b, (byte) 1), r4u.a(new xap((Object) this, (byte) 7)))});
                        this.b = r4u.a(new sun(this, (byte) 9));
                        this.d = r4u.a(new ogr(this, (byte) 4));
                        return;
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public static boolean d(Calendar calendar, Calendar calendar2) {
        return calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    public up0 a() {
        a1r0 a1r0Var = (a1r0) ((vah1) this.c).g.get();
        c8o.l(a1r0Var);
        return new up0(a1r0Var);
    }

    public SpannableString b(int i, long j) {
        g1i g1iVar = (g1i) this.c;
        String quantityString = ((ConstraintLayout) g1iVar.b).getResources().getQuantityString(i, (int) j, String.valueOf(j));
        Spanned spannedFromHtml = Html.fromHtml(quantityString, 0);
        SpannableString spannableString = new SpannableString(spannedFromHtml);
        StyleSpan[] styleSpanArr = (StyleSpan[]) spannedFromHtml.getSpans(0, spannedFromHtml.length(), StyleSpan.class);
        styleSpanArr.getClass();
        for (StyleSpan styleSpan : styleSpanArr) {
            spannableString.setSpan(new l0e1(((ConstraintLayout) g1iVar.b).getContext(), 2132018012, -1), spannedFromHtml.getSpanStart(styleSpan), spannedFromHtml.getSpanEnd(styleSpan), 33);
        }
        return spannableString;
    }

    public edr c(dwn0 dwn0Var, Bundle bundle) {
        yym0 yym0Var = (yym0) this.d;
        Intent intentA = ((fwn0) this.a).a(dwn0Var);
        intentA.putExtras(bundle);
        boolean zB = yym0Var.b(intentA);
        edr edrVar = edr.c;
        if (!zB) {
            return yym0Var.a.getPackageManager().resolveActivity(intentA, 65536) != null ? edr.a : edrVar;
        }
        p811 p811Var = new p811();
        p811Var.a = edrVar;
        jvn0 jvn0Var = (jvn0) this.b;
        m3n m3nVar = new m3n(p811Var, this, intentA, (byte) 7);
        th61 th61Var = jvn0Var.d;
        if (th61Var != null) {
            m3nVar.invoke(th61Var);
        }
        return (edr) p811Var.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object e(List list, String str, String str2, gy1 gy1Var, tv80 tv80Var, boolean z, onm onmVar) {
        gsr gsrVar;
        if (onmVar instanceof gsr) {
            gsrVar = (gsr) onmVar;
            int i = gsrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gsrVar.c = i - Integer.MIN_VALUE;
            } else {
                gsrVar = new gsr(this, onmVar);
            }
        } else {
            gsrVar = new gsr(this, onmVar);
        }
        gsr gsrVar2 = gsrVar;
        Object obj = gsrVar2.a;
        int i2 = gsrVar2.c;
        if (i2 == 0) {
            hm5.M(obj);
            q8n q8nVar = (q8n) this.d;
            af0 af0Var = new af0(this, list, str, str2, tv80Var, gy1Var, z, (lnm) null);
            gsrVar2.c = 1;
            Object objY = fn31.Y(q8nVar, af0Var, gsrVar2);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return new mj3();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object f(String str, boolean z, String str2, String str3, tv80 tv80Var, onm onmVar) {
        hsr hsrVar;
        if (onmVar instanceof hsr) {
            hsrVar = (hsr) onmVar;
            int i = hsrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hsrVar.c = i - Integer.MIN_VALUE;
            } else {
                hsrVar = new hsr(this, onmVar);
            }
        } else {
            hsrVar = new hsr(this, onmVar);
        }
        hsr hsrVar2 = hsrVar;
        Object obj = hsrVar2.a;
        int i2 = hsrVar2.c;
        if (i2 == 0) {
            hm5.M(obj);
            q8n q8nVar = (q8n) this.d;
            el0 el0Var = new el0(this, str, str2, str3, z, tv80Var, (lnm) null);
            hsrVar2.c = 1;
            Object objY = fn31.Y(q8nVar, el0Var, hsrVar2);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return new mj3();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(gj3 gj3Var, nj3 nj3Var, List list, List list2, List list3, String str, String str2, onm onmVar) {
        isr isrVar;
        if (onmVar instanceof isr) {
            isrVar = (isr) onmVar;
            int i = isrVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                isrVar.d = i - Integer.MIN_VALUE;
            } else {
                isrVar = new isr(this, onmVar);
            }
        } else {
            isrVar = new isr(this, onmVar);
        }
        Object obj = isrVar.b;
        int i2 = isrVar.d;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nj3 nj3Var2 = isrVar.a;
            hm5.M(obj);
            return nj3Var2;
        }
        hm5.M(obj);
        if (gj3Var.b) {
            Completable completableB = cfr.b((cfr) this.c, list, str, list2, list3, str2);
            isrVar.a = nj3Var;
            isrVar.d = 1;
            Object objI = fc11.i(completableB, isrVar);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        }
        return nj3Var;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0112  */
    /* JADX WARN: Code duplicated, block: B:56:0x0119  */
    /* JADX WARN: Code duplicated, block: B:58:0x0121  */
    /* JADX WARN: Code duplicated, block: B:59:0x0126  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(List list, blc0 blc0Var, boolean z, gj3 gj3Var, onm onmVar) {
        jsr jsrVar;
        jmt jmtVar;
        njo jjoVar;
        njo njoVar;
        uio uioVar;
        jmt jmtVar2;
        boolean z2;
        blc0 blc0Var2;
        njo njoVar2;
        Object objL;
        uio uioVar2;
        List listSingletonList;
        String str;
        if (onmVar instanceof jsr) {
            jsrVar = (jsr) onmVar;
            int i = jsrVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                jsrVar.i = i - Integer.MIN_VALUE;
            } else {
                jsrVar = new jsr(this, onmVar);
            }
        } else {
            jsrVar = new jsr(this, onmVar);
        }
        Object objH = jsrVar.g;
        int i2 = jsrVar.i;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objH);
            a0m a0mVar = (a0m) this.c;
            imt imtVar = new imt(list, blc0Var, z);
            jsrVar.a = blc0Var;
            jsrVar.b = gj3Var;
            jsrVar.f = z;
            jsrVar.i = 1;
            objH = a0mVar.h(imtVar, jsrVar);
            if (objH != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            z = jsrVar.f;
            gj3Var = jsrVar.b;
            blc0Var = jsrVar.a;
            hm5.M(objH);
        } else {
            if (i2 == 2) {
                z2 = jsrVar.f;
                njoVar2 = jsrVar.d;
                jmtVar2 = jsrVar.c;
                gj3Var = jsrVar.b;
                blc0Var2 = jsrVar.a;
                hm5.M(objH);
                uioVar = (uio) objH;
                jmt jmtVar3 = jmtVar2;
                z = z2;
                jmtVar = jmtVar3;
                blc0 blc0Var3 = blc0Var2;
                njoVar = njoVar2;
                blc0Var = blc0Var3;
                tr31 tr31Var = new tr31(jmtVar, blc0Var, gj3Var.d);
                jsrVar.a = null;
                jsrVar.b = null;
                jsrVar.c = jmtVar;
                jsrVar.d = null;
                jsrVar.e = uioVar;
                jsrVar.f = z;
                jsrVar.i = 3;
                objL = l(njoVar, tr31Var, uioVar, jsrVar);
                if (objL != d9nVar) {
                    uio uioVar3 = uioVar;
                    objH = objL;
                    uioVar2 = uioVar3;
                }
                return d9nVar;
            }
            if (i2 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uioVar2 = jsrVar.e;
            jmtVar = jsrVar.c;
            hm5.M(objH);
        }
        ls31 ls31Var = (ls31) objH;
        if (uioVar2 != null) {
            str = uioVar2.a;
            if (str.length() > 0) {
                listSingletonList = Collections.singletonList(str);
            } else {
                listSingletonList = jmtVar.c;
            }
        } else {
            listSingletonList = jmtVar.c;
        }
        return new ojo(ls31Var.a, ls31Var.b, listSingletonList);
        jmtVar = (jmt) objH;
        iir iirVar = (iir) this.b;
        if (jmtVar.b == 2) {
            jjoVar = kjo.a;
        } else {
            njo mjoVar = ((vlo) iirVar.c).b(blc0Var) ? new mjo() : ljo.a;
            jjoVar = (!z && ((ol4) ((el3) ((xap) iirVar.b).b).a.getValue()).c() && (blc0Var == blc0.ti || blc0Var == blc0.Pg || blc0Var == blc0.fh || blc0Var == blc0.ed)) ? new jjo(mjoVar) : mjoVar;
        }
        if (jjoVar.a()) {
            jl00 jl00Var = (jl00) this.a;
            String str2 = (String) o7h.q0(jmtVar.c);
            jsrVar.a = blc0Var;
            jsrVar.b = gj3Var;
            jsrVar.c = jmtVar;
            jsrVar.d = jjoVar;
            jsrVar.f = z;
            jsrVar.i = 2;
            Object objC = jl00Var.c(str2, "aligned_curation_handler", jsrVar);
            if (objC != d9nVar) {
                boolean z3 = z;
                jmtVar2 = jmtVar;
                z2 = z3;
                blc0Var2 = blc0Var;
                njoVar2 = jjoVar;
                objH = objC;
                uioVar = (uio) objH;
                jmt jmtVar4 = jmtVar2;
                z = z2;
                jmtVar = jmtVar4;
                blc0 blc0Var4 = blc0Var2;
                njoVar = njoVar2;
                blc0Var = blc0Var4;
                tr31 tr31Var2 = new tr31(jmtVar, blc0Var, gj3Var.d);
                jsrVar.a = null;
                jsrVar.b = null;
                jsrVar.c = jmtVar;
                jsrVar.d = null;
                jsrVar.e = uioVar;
                jsrVar.f = z;
                jsrVar.i = 3;
                objL = l(njoVar, tr31Var2, uioVar, jsrVar);
                if (objL != d9nVar) {
                    uio uioVar4 = uioVar;
                    objH = objL;
                    uioVar2 = uioVar4;
                    ls31 ls31Var2 = (ls31) objH;
                    if (uioVar2 != null) {
                        str = uioVar2.a;
                        if (str.length() > 0) {
                            listSingletonList = Collections.singletonList(str);
                        } else {
                            listSingletonList = jmtVar.c;
                        }
                    } else {
                        listSingletonList = jmtVar.c;
                    }
                    return new ojo(ls31Var2.a, ls31Var2.b, listSingletonList);
                }
            }
        } else {
            njoVar = jjoVar;
            uioVar = null;
            tr31 tr31Var3 = new tr31(jmtVar, blc0Var, gj3Var.d);
            jsrVar.a = null;
            jsrVar.b = null;
            jsrVar.c = jmtVar;
            jsrVar.d = null;
            jsrVar.e = uioVar;
            jsrVar.f = z;
            jsrVar.i = 3;
            objL = l(njoVar, tr31Var3, uioVar, jsrVar);
            if (objL != d9nVar) {
                uio uioVar5 = uioVar;
                objH = objL;
                uioVar2 = uioVar5;
                ls31 ls31Var3 = (ls31) objH;
                if (uioVar2 != null) {
                    str = uioVar2.a;
                    if (str.length() > 0) {
                        listSingletonList = Collections.singletonList(str);
                    } else {
                        listSingletonList = jmtVar.c;
                    }
                } else {
                    listSingletonList = jmtVar.c;
                }
                return new ojo(ls31Var3.a, ls31Var3.b, listSingletonList);
            }
        }
        return d9nVar;
    }

    public g931 i() {
        l351 l351Var = (l351) this.c;
        qm3 qm3Var = (qm3) l351Var.a.get();
        yqg yqgVar = (yqg) l351Var.e.get();
        c8o.l(yqgVar);
        edr0 edr0Var = (edr0) l351Var.b.get();
        c8o.l(edr0Var);
        return new g931(qm3Var, yqgVar, edr0Var, (byte) 22);
    }

    public dlg1 j() {
        ygh1 ygh1Var = (ygh1) this.c;
        lzn0 lzn0Var = (lzn0) ygh1Var.d.get();
        c8o.l(lzn0Var);
        zgh1 zgh1Var = (zgh1) this.a;
        g5p0 g5p0Var = (g5p0) ygh1Var.e.get();
        c8o.l(g5p0Var);
        return new dlg1(lzn0Var, zgh1Var, g5p0Var);
    }

    public ptf1 k() {
        d0r d0rVar = ((jbt) this.b).b;
        j9q j9qVar = (j9q) ((y0q) this.c).b.vr.get();
        c8o.l(j9qVar);
        return j9qVar.a(d0rVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(njo njoVar, tr31 tr31Var, uio uioVar, onm onmVar) {
        ksr ksrVar;
        ls31 ls31Var;
        if (onmVar instanceof ksr) {
            ksrVar = (ksr) onmVar;
            int i = ksrVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ksrVar.f = i - Integer.MIN_VALUE;
            } else {
                ksrVar = new ksr(this, onmVar);
            }
        } else {
            ksrVar = new ksr(this, onmVar);
        }
        Object objF = ksrVar.d;
        int i2 = ksrVar.f;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objF);
            if (njoVar instanceof kjo) {
                return new ls31(tr31Var.a.a, 2);
            }
            if (njoVar instanceof jjo) {
                rjn rjnVar = (rjn) this.d;
                ksrVar.a = (jjo) njoVar;
                ksrVar.b = tr31Var;
                ksrVar.c = uioVar;
                ksrVar.f = 1;
                objF = rjnVar.f(tr31Var, uioVar, ksrVar);
                if (objF != d9nVar) {
                }
            } else {
                if (!(njoVar instanceof mjo)) {
                    if (njoVar instanceof ljo) {
                        jmt jmtVar = tr31Var.a;
                        return new ls31(jmtVar.a, jmtVar.b);
                    }
                    eg.o();
                    return null;
                }
                if (uioVar == null) {
                    ls31Var = null;
                } else {
                    rio rioVar = uioVar.b;
                    if (rioVar instanceof sio) {
                        ls31Var = new ls31(jio.a, 1);
                    } else if (rioVar instanceof rio) {
                        ls31Var = new ls31(new iio(rioVar.c), 1);
                    } else if (rioVar instanceof qio) {
                        ls31Var = new ls31(gio.a, 1);
                    } else if (rioVar instanceof pio) {
                        ls31Var = new ls31(tr31Var.a.a, 2);
                    } else {
                        if (!(rioVar instanceof tio)) {
                            eg.o();
                            return null;
                        }
                        ls31Var = null;
                    }
                }
                if (ls31Var != null) {
                    return ls31Var;
                }
                ksrVar.a = null;
                ksrVar.b = null;
                ksrVar.c = null;
                ksrVar.f = 3;
                Object objL = l(ljo.a, tr31Var, uioVar, ksrVar);
                if (objL != d9nVar) {
                    return objL;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objF);
                return objF;
            }
            if (i2 == 3) {
                hm5.M(objF);
                return objF;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uioVar = ksrVar.c;
        tr31Var = ksrVar.b;
        njoVar = ksrVar.a;
        hm5.M(objF);
        ls31 ls31Var2 = (ls31) objF;
        if (ls31Var2 != null) {
            return ls31Var2;
        }
        njo njoVar2 = ((jjo) njoVar).a;
        ksrVar.a = null;
        ksrVar.b = null;
        ksrVar.c = null;
        ksrVar.f = 2;
        Object objL2 = l(njoVar2, tr31Var, uioVar, ksrVar);
        return objL2 == d9nVar ? d9nVar : objL2;
    }

    public Object n(k371 k371Var, lnm lnmVar) {
        char c;
        List listP;
        String str;
        dn3 dn3Var;
        u771 u771VarP;
        Bundle bundle = k371Var.b;
        String string = bundle.getString("format.list.type");
        if (string == null) {
            return null;
        }
        le30 le30VarA = ((me30) this.c).a(string);
        String string2 = bundle.getString("share.entity.name");
        boolean z = le30VarA == le30.Z;
        if (!z && le30VarA != le30.Y) {
            return null;
        }
        Context context = (Context) this.b;
        String string3 = z ? context.getString(2131954848, string2) : context.getString(2131954847, string2);
        string3.getClass();
        String string4 = bundle.getString("share_data");
        String string5 = bundle.getString("sticker_background_color");
        xm71 xm71Var = k371Var.c;
        if (u890.j(xm71Var, um71.b)) {
            c = 2;
        } else if (u890.j(xm71Var, wm71.b)) {
            c = 3;
        } else {
            c = u890.j(xm71Var, tm71.b) ? (char) 1 : (char) 0;
        }
        wa71 wa71Var = k371Var.a;
        if (wa71Var == null) {
            return null;
        }
        dn3 dn3Var2 = (dn3) this.d;
        String str2 = wa71Var.a;
        ShareData shareDataR = string4 != null ? ShareData.r(Base64.decode(string4, 0)) : null;
        if (shareDataR == null) {
            shareDataR = ShareData.n();
        }
        if (z) {
            listP = p7h.N(shareDataR.q());
        } else if (c == 3) {
            listP = p7h.N(shareDataR.o());
        } else {
            listP = shareDataR.p();
            if (listP == null) {
                listP = z6x.a;
            }
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listP) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            ShareCard shareCard = (ShareCard) obj;
            String string6 = dn3Var2.a.getString(2131954846, Integer.valueOf(i2), Integer.valueOf(listP.size()));
            dxy dxyVarG = dn3.g();
            dxyVarG.c = m1f1.a;
            blc0 blc0Var = blc0.lg;
            dxyVarG.d = tyo1.p(blc0Var, new String[]{shareCard.p(), String.valueOf(i)});
            f0a f0aVar = new f0a();
            ((LinkedHashSet) f0aVar.N0).add(g571.d);
            f0aVar.h = tyo1.p(blc0Var, new String[]{shareCard.p(), String.valueOf(i)});
            int i3 = a271.a[shareCard.n().ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    u771VarP = null;
                } else if (string5 != null) {
                    f0aVar.b = str2;
                    int color = Color.parseColor(string5);
                    f0aVar.h(new ilw0(color, color, string6));
                    f0aVar.i = new jlw0(shareCard.getImageUrl(), string6);
                    f0aVar.c = string3;
                    u771VarP = f0aVar.p();
                } else {
                    str = str2;
                    dn3Var = dn3Var2;
                    dxyVarG.b = new wa71(str, (String) null, (cqs0) null, (dqi1) null, string3, (String) null, (Bundle) null, 110);
                    u771VarP = dxyVarG.r();
                }
                str = str2;
                dn3Var = dn3Var2;
            } else {
                str = str2;
                dn3Var = dn3Var2;
                f0aVar.b = str;
                f0aVar.h(new jlw0(shareCard.getImageUrl(), string6));
                f0aVar.c = string3;
                u771VarP = f0aVar.p();
            }
            if (u771VarP != null) {
                arrayList.add(u771VarP);
            }
            dn3Var2 = dn3Var;
            str2 = str;
            i = i2;
        }
        String str3 = str2;
        boolean zIsEmpty = arrayList.isEmpty();
        List listSingletonList = arrayList;
        if (zIsEmpty) {
            dxy dxyVarG2 = dn3.g();
            dxyVarG2.b = new wa71(str3, (String) null, (cqs0) null, (dqi1) null, string3, (String) null, (Bundle) null, 110);
            dxyVarG2.c = new n1f1(true);
            listSingletonList = Collections.singletonList(dxyVarG2.r());
        }
        return new qj71(listSingletonList, 0, new quk(new va71((cmt) this.a)));
    }

    public jnq(yqg yqgVar) {
        this.c = yqgVar;
        this.a = yqgVar.d();
        Calendar calendarD = yqgVar.d();
        this.b = calendarD;
        calendarD.setTimeInMillis(calendarD.getTimeInMillis() - 86400000);
        Calendar calendarD2 = yqgVar.d();
        this.d = calendarD2;
        calendarD2.set(10, 0);
        calendarD2.set(12, 0);
        calendarD2.set(13, 0);
        calendarD2.set(14, 0);
        calendarD2.add(6, -7);
    }

    public /* synthetic */ jnq(Object obj, Object obj2, Object obj3, Object obj4) {
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
        this.d = obj4;
    }

    public jnq(a0m a0mVar, jl00 jl00Var, iir iirVar, rjn rjnVar, lqc lqcVar) {
        this.c = a0mVar;
        this.a = jl00Var;
        this.b = iirVar;
        this.d = rjnVar;
    }

    public jnq(y0q y0qVar, qop qopVar, jbt jbtVar) {
        this.c = y0qVar;
        this.a = qopVar;
        this.b = jbtVar;
        this.d = new hsq(this, (byte) 19);
    }

    public jnq(d1q d1qVar, qop qopVar, gl90 gl90Var, boolean z) {
        this.c = gl90Var;
        this.b = qopVar;
        this.d = d1qVar;
        this.a = iy81.a(new bpq(this, (byte) 23));
    }

    public jnq(i3q i3qVar, fl90 fl90Var) {
        this.c = fl90Var;
        this.d = i3qVar;
        this.a = iy81.a(new ttq(this, 1, (byte) 4));
        this.b = iy81.a(new ttq(this, 0, (byte) 4));
    }

    public jnq(lvc1 lvc1Var, r6h1 r6h1Var) {
        this.c = lvc1Var;
        this.d = r6h1Var;
        byte b = 27;
        this.a = iy81.a(new jxp(this, 1, b));
        this.b = iy81.a(new jxp(this, 0, b));
    }

    public jnq(izp izpVar, qop qopVar, gl90 gl90Var) {
        this.c = izpVar;
        this.b = gl90Var;
        this.d = qopVar;
        this.a = iy81.a(new bpq(this, (byte) 21));
    }

    public jnq(d1q d1qVar, qop qopVar, gl90 gl90Var) {
        this.c = qopVar;
        this.b = d1qVar;
        this.d = gl90Var;
        this.a = iy81.a(new bpq(this, (byte) 17));
    }

    public jnq(l3q l3qVar, qop qopVar) {
        this.c = l3qVar;
        this.b = qopVar;
        byte b = 20;
        this.a = iy81.a(new jxp(this, 1, b));
        this.d = new jxp(this, 0, b);
    }

    public jnq(lzp lzpVar, qop qopVar, jbt jbtVar) {
        this.c = jbtVar;
        this.b = qopVar;
        this.d = lzpVar;
        this.a = iy81.a(new bpq(this, (byte) 16));
    }

    public jnq(l3q l3qVar, qop qopVar, fl90 fl90Var) {
        this.c = fl90Var;
        this.b = qopVar;
        this.d = l3qVar;
        this.a = iy81.a(new bpq(this, (byte) 22));
    }

    public jnq(k3q k3qVar, qop qopVar) {
        this.c = qopVar;
        this.b = k3qVar;
        this.d = new ttq(this, 1, (byte) 8);
        this.a = iy81.a(new ttq(this, 0, (byte) 8));
    }

    public jnq(jbq jbqVar, qop qopVar, rbt rbtVar, boolean z) {
        this.c = rbtVar;
        this.b = jbqVar;
        this.d = qopVar;
        this.a = iy81.a(new bpq(this, (byte) 19));
    }

    public jnq(vzp vzpVar, gl90 gl90Var) {
        this.c = gl90Var;
        this.b = vzpVar;
        byte b = 21;
        this.d = new jxp(this, 1, b);
        this.a = iy81.a(new jxp(this, 0, b));
    }

    public jnq(chl1 chl1Var) {
        this.c = chl1Var;
        this.a = xqu.b(new tsq(this, 1, (byte) 24));
        this.b = new tsq(this, 2, (byte) 24);
        this.d = new tsq(this, 0, (byte) 24);
    }

    public jnq(k3q k3qVar, qop qopVar, jbt jbtVar) {
        this.c = jbtVar;
        this.a = qopVar;
        this.b = k3qVar;
        this.d = new bpq(this, (byte) 1);
    }

    public jnq(dj21 dj21Var, fj21 fj21Var) {
        this.c = dj21Var;
        this.d = fj21Var;
        byte b = 12;
        this.a = iy81.a(new jxp(this, 1, b));
        this.b = iy81.a(new jxp(this, 0, b));
    }

    public jnq(l351 l351Var) {
        this.c = l351Var;
        this.a = iy81.a(new ykq(this, 1, (byte) 25));
        this.b = iy81.a(new ykq(this, 2, (byte) 25));
        this.d = iy81.a(new ykq(this, 0, (byte) 25));
    }

    public jnq(vah1 vah1Var, wah1 wah1Var) {
        this.c = vah1Var;
        this.a = new tsq(this, 0, (byte) 10);
        this.b = new tsq(this, 1, (byte) 10);
        this.d = new tsq(this, 2, (byte) 10);
    }

    public jnq(jbq jbqVar, qop qopVar, rbt rbtVar) {
        this.c = qopVar;
        this.d = jbqVar;
        byte b = 19;
        this.a = iy81.a(new jxp(this, 1, b));
        this.b = iy81.a(new jxp(this, 0, b));
    }

    public jnq(u531 u531Var, w531 w531Var, q7r0 q7r0Var) {
        this.c = u531Var;
        this.d = q7r0Var;
        byte b = 14;
        this.a = xqu.b(new jxp(this, 1, b));
        this.b = xqu.b(new jxp(this, 0, b));
    }

    public jnq(ygh1 ygh1Var, zgh1 zgh1Var, q7r0 q7r0Var) {
        this.c = ygh1Var;
        this.a = zgh1Var;
        this.b = q7r0Var;
        this.d = new hsq(this, (byte) 12);
    }

    public jnq(z901 z901Var) {
        this.c = z901Var;
        this.a = xqu.b(new ykq(this, 1, (byte) 13));
        this.b = iy81.a(new ykq(this, 0, (byte) 13));
        this.d = iy81.a(new ykq(this, 2, (byte) 13));
    }

    public jnq(eug1 eug1Var, fug1 fug1Var) {
        this.c = fug1Var;
        this.d = eug1Var;
        byte b = 28;
        this.a = xqu.b(new jxp(this, 0, b));
        this.b = iy81.a(new jxp(this, 1, b));
    }

    public jnq(ej21 ej21Var, gj21 gj21Var) {
        this.c = ej21Var;
        this.a = iy81.a(new ykq(this, 2, (byte) 20));
        this.b = iy81.a(new ykq(this, 1, (byte) 20));
        this.d = iy81.a(new ykq(this, 0, (byte) 20));
    }

    public jnq(oxk1 oxk1Var, zuj zujVar, iyk1 iyk1Var, q7r0 q7r0Var) {
        this.c = oxk1Var;
        this.a = new tsq(this, 0, (byte) 22);
        this.b = new tsq(this, 1, (byte) 22);
        this.d = new tsq(this, 2, (byte) 22);
    }
}
