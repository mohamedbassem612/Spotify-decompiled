package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkShadow;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vun implements qiw, Function, f080, hfv, FlowableOnSubscribe {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ vun(rjn rjnVar) {
        this.a = (byte) 25;
        this.b = ((v280) rjnVar.b).g();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.hfv
    public Object a(onm onmVar) {
        ewr ewrVar;
        if (onmVar instanceof ewr) {
            ewrVar = (ewr) onmVar;
            int i = ewrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ewrVar.c = i - Integer.MIN_VALUE;
            } else {
                ewrVar = new ewr(this, onmVar);
            }
        } else {
            ewrVar = new ewr(this, onmVar);
        }
        Object objI = ewrVar.a;
        int i2 = ewrVar.c;
        if (i2 == 0) {
            hm5.M(objI);
            any anyVarD = ((koc0) this.b).d();
            ewrVar.c = 1;
            objI = b5p1.i(anyVarD, ewrVar);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        String str = ((cxc0) objI).f.b;
        if (ihc1.y0(str)) {
            return null;
        }
        return str;
    }

    public Object apply(Object obj) {
        ArrayList arrayList;
        z6x z6xVar;
        z6x arrayList2;
        Iterator it;
        String str;
        List list;
        String str2;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                uv00 uv00Var = (uv00) obj;
                x6o x6oVar = (x6o) obj2;
                String str3 = x6oVar.t;
                j7o j7oVar = uv00Var.a(j7o.class, str3).b;
                ArrayList<g7o> arrayList3 = j7oVar != null ? j7oVar.a : null;
                jo70 jo70Var = uv00Var.a(jo70.class, str3).b;
                z6x z6xVar2 = jo70Var != null ? jo70Var.d : null;
                z6x z6xVar3 = z6x.a;
                if (z6xVar2 == null) {
                    z6xVar2 = z6xVar3;
                }
                if (arrayList3 != null) {
                    arrayList = new ArrayList(q7h.U(arrayList3, 10));
                    for (g7o g7oVarA : arrayList3) {
                        Iterable iterable = (Iterable) z6xVar2;
                        ArrayList arrayList4 = new ArrayList(q7h.U(iterable, 10));
                        Iterator it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(((ho70) it2.next()).b);
                        }
                        if (!o7h.i0(arrayList4, g7oVarA.c)) {
                            g7oVarA = g7o.a(g7oVarA);
                        }
                        arrayList.add(g7oVarA);
                    }
                } else {
                    arrayList = null;
                }
                jo70 jo70Var2 = uv00Var.a(jo70.class, str3).b;
                String str4 = jo70Var2 != null ? jo70Var2.a : null;
                if (str4 == null) {
                    str4 = "";
                }
                String strY0 = o7h.y0((Iterable) z6xVar2, " • ", (String) null, (String) null, h4o.X0, 30);
                if (arrayList != null) {
                    boolean z = x6oVar.g.a;
                    ArrayList arrayList5 = new ArrayList(q7h.U(arrayList, 10));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        h7o h7oVar = ((g7o) it3.next()).e;
                        arrayList5.add(h7oVar != null ? h7oVar.a : "");
                    }
                    List listJ0 = o7h.j0(arrayList5);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj3 : arrayList) {
                        h7o h7oVar2 = ((g7o) obj3).e;
                        String str5 = h7oVar2 != null ? h7oVar2.a : "";
                        Object objH = linkedHashMap.get(str5);
                        if (objH == null) {
                            objH = cfm0.h(str5, linkedHashMap);
                        }
                        ((List) objH).add(obj3);
                    }
                    z6x arrayList6 = new ArrayList();
                    Iterator it4 = listJ0.iterator();
                    int i = 0;
                    while (it4.hasNext()) {
                        Object next = it4.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            p7h.T();
                            throw null;
                        }
                        String str6 = (String) next;
                        String str7 = str6.length() == 0 ? null : str6;
                        List list2 = (List) sqg0.G(str6, linkedHashMap);
                        boolean z2 = i == 0;
                        ArrayList arrayList7 = new ArrayList();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Object obj4 : list2) {
                            boolean z3 = z;
                            z6x z6xVar4 = z6xVar3;
                            String str8 = ((g7o) obj4).a;
                            Object objH2 = linkedHashMap2.get(str8);
                            if (objH2 == null) {
                                objH2 = cfm0.h(str8, linkedHashMap2);
                            }
                            ((List) objH2).add(obj4);
                            z = z3;
                            z6xVar3 = z6xVar4;
                        }
                        boolean z4 = z;
                        z6x z6xVar5 = z6xVar3;
                        Iterator it5 = linkedHashMap2.entrySet().iterator();
                        while (it5.hasNext()) {
                            Map.Entry entry = (Map.Entry) it5.next();
                            String str9 = (String) entry.getKey();
                            List list3 = (List) entry.getValue();
                            if (z2) {
                                Iterator it6 = list3.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        it = it5;
                                        str = ((g7o) it6.next()).c;
                                        if (str == null) {
                                            it5 = it;
                                        }
                                    } else {
                                        it = it5;
                                        str = null;
                                    }
                                }
                            } else {
                                it = it5;
                                str = null;
                            }
                            if (str == null || str.length() == 0) {
                                Iterator it7 = list3.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        list = list3;
                                        str2 = ((g7o) it7.next()).d;
                                        if (str2 == null) {
                                            list3 = list;
                                        }
                                    } else {
                                        list = list3;
                                        str2 = null;
                                    }
                                }
                            } else {
                                list = list3;
                                str2 = null;
                            }
                            List list4 = list;
                            Iterator it8 = it4;
                            LinkedHashMap linkedHashMap3 = linkedHashMap;
                            boolean z5 = z2;
                            ArrayList arrayList8 = new ArrayList(q7h.U(list4, 10));
                            Iterator it9 = list4.iterator();
                            while (it9.hasNext()) {
                                g7o g7oVar = (g7o) it9.next();
                                Iterator it10 = it9;
                                arrayList8.add(new qm31(g7oVar.b, z4 && g7oVar.f != null));
                                it9 = it10;
                            }
                            arrayList7.add(new iwm(str9, str, str2, arrayList8));
                            it4 = it8;
                            it5 = it;
                            linkedHashMap = linkedHashMap3;
                            z2 = z5;
                        }
                        arrayList6.add(new pwm(str7, arrayList7));
                        i = i2;
                        z = z4;
                        z6xVar3 = z6xVar5;
                    }
                    z6xVar = arrayList6;
                } else {
                    z6xVar = null;
                }
                z6x z6xVar6 = z6xVar3;
                if (z6xVar == null) {
                    z6xVar = z6xVar6;
                }
                j7o j7oVar2 = uv00Var.a(j7o.class, str3).b;
                if (j7oVar2 != null) {
                    ArrayList arrayList9 = j7oVar2.b;
                    arrayList2 = new ArrayList(q7h.U(arrayList9, 10));
                    Iterator it11 = arrayList9.iterator();
                    while (it11.hasNext()) {
                        arrayList2.add(((i7o) it11.next()).a);
                    }
                } else {
                    arrayList2 = z6xVar6;
                }
                return new a7o(str4, strY0, z6xVar, arrayList2);
            case 6:
                return new zhr((wt8) obj2, ((Boolean) obj).booleanValue());
            case 15:
                zdz0 zdz0Var = (zdz0) obj;
                fwi0 fwi0Var = zdz0Var.a;
                if ((fwi0Var.d instanceof tvi0) || !fwi0Var.g) {
                    return Single.just(new mmr0(zdz0Var, Boolean.TRUE));
                }
                f8s f8sVar = ((e8s) obj2).b;
                return f8sVar.c.x(qzs0.X0).J(rzs0.X0).z().map(new iir(f8sVar, fwi0Var.a, (byte) 14)).map(new rjn(zdz0Var, (byte) 15));
            default:
                String str10 = (String) obj;
                kp5 kp5Var = (kp5) obj2;
                int length = str10.length();
                Context context = (Context) kp5Var.a;
                String string = length > 0 ? context.getString(2131952241, str10) : context.getString(2131952249);
                string.getClass();
                return kp5Var.y(string);
        }
    }

    public void b(hmb0 hmb0Var) {
        if (!hmb0Var.I()) {
            qf80.c("DepthSortedSet.add called on an unattached node");
        }
        ((hja1) this.b).add(hmb0Var);
    }

    public boolean c() {
        return ((hja1) this.b).isEmpty();
    }

    public hmb0 d() {
        hmb0 hmb0Var = (hmb0) ((hja1) this.b).first();
        f(hmb0Var);
        return hmb0Var;
    }

    public void e(int i, Bitmap bitmap) {
        ((SingleEmitter) this.b).onSuccess(Integer.valueOf(bitmap.getPixel(0, 0)));
    }

    public boolean f(hmb0 hmb0Var) {
        if (!hmb0Var.I()) {
            qf80.c("DepthSortedSet.remove called on an unattached node");
        }
        return ((hja1) this.b).remove(hmb0Var);
    }

    public void m(Drawable drawable) {
        ((SingleEmitter) this.b).tryOnError(new Throwable((Throwable) null));
    }

    public void subscribe(FlowableEmitter flowableEmitter) {
        iac0 iac0Var = (iac0) this.b;
        rjd rjdVar = new rjd(flowableEmitter, (byte) 2);
        if (!flowableEmitter.isCancelled()) {
            iac0Var.getLifecycle().a(rjdVar);
        }
        flowableEmitter.setCancellable(new pc6(iac0Var, rjdVar, (byte) 4));
    }

    public String toString() {
        switch (this.a) {
            case 26:
                return ((hja1) this.b).toString();
            default:
                return super.toString();
        }
    }

    public void v(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                mmr0 mmr0Var = (mmr0) obj;
                CharSequence charSequence = (CharSequence) mmr0Var.a;
                boolean zBooleanValue = ((Boolean) mmr0Var.b).booleanValue();
                avn avnVar = (avn) obj2;
                TextView textView = (TextView) avnVar.V0.findViewById(2131428374);
                if (zBooleanValue) {
                    textView.getClass();
                    textView.setVisibility(0);
                    textView.setText(avnVar.a.getString(2131954795));
                    textView.setTextColor(xfo1.r(textView, 2130968792));
                } else if (charSequence == null) {
                    textView.getClass();
                    textView.setVisibility(8);
                } else {
                    textView.getClass();
                    textView.setVisibility(0);
                    textView.setText(charSequence);
                    textView.setTextColor(xfo1.r(textView, 2130968788));
                }
                break;
            case 7:
                Boolean bool = (Boolean) obj;
                plr plrVar = (plr) obj2;
                EncoreButton encoreButton = plrVar.a;
                bool.getClass();
                encoreButton.setLongClickable(bool.booleanValue());
                encoreButton.setContentDescription(plrVar.b.getContext().getString(bool.booleanValue() ? 2131955495 : 2131955494));
                break;
            case 8:
                xik xikVar = (xik) obj;
                zmr zmrVar = (zmr) obj2;
                List list = xikVar.i;
                boolean z = xikVar.o;
                e93 e93Var = zmrVar.e;
                TextView textView2 = (TextView) e93Var.R0;
                TextView textView3 = (TextView) e93Var.T0;
                if (!z) {
                    textView2.setVisibility(8);
                    textView3.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    textView3.setVisibility(0);
                    textView2.setText(o7h.y0(list, ", ", (String) null, (String) null, (iu30) null, 54));
                    textView3.setText(zmrVar.O0);
                }
                break;
            case 10:
                oyn oynVar = (oyn) obj;
                err errVar = (err) obj2;
                FrameLayout frameLayout = errVar.g;
                ImageView imageView = errVar.f;
                qyn qynVar = oynVar.l;
                String str = oynVar.h;
                int iC = l1d.C(qynVar.b);
                if (iC == 0) {
                    if (str == null || str.length() == 0) {
                        imageView.setVisibility(8);
                        frameLayout.setVisibility(8);
                    } else {
                        imageView.setVisibility(0);
                        frameLayout.setVisibility(0);
                        double d = qynVar.a == 2 ? 0.67d : 0.75d;
                        Object parent = imageView.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        if (view != null) {
                            if (!view.isLaidOut() || view.isLayoutRequested()) {
                                view.addOnLayoutChangeListener(new drr(imageView, d));
                            } else {
                                int width = view.getWidth();
                                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                                layoutParams.width = width;
                                layoutParams.height = (int) (((double) width) * d);
                                imageView.setLayoutParams(layoutParams);
                            }
                        }
                        ixg ixgVarF = errVar.b.f(str);
                        ixgVarF.m((Drawable) errVar.O0.getValue());
                        ixgVarF.k(imageView, (ird1) null);
                    }
                } else if (iC == 1 || iC == 2) {
                    imageView.setVisibility(8);
                    frameLayout.setVisibility(8);
                } else {
                    eg.o();
                }
                break;
            case 11:
                ofo ofoVar = (ofo) obj;
                wdm wdmVar = ((srr) obj2).b;
                if (ofoVar != null) {
                    ((ConstraintLayout) wdmVar.i).setVisibility(0);
                    ((TextView) wdmVar.t).setText(ofoVar.a);
                    ((TextView) wdmVar.h).setText(String.valueOf(ofoVar.b));
                } else {
                    ((ConstraintLayout) wdmVar.i).setVisibility(8);
                }
                break;
            case 13:
                ((TextView) ((dxy) ((yir) obj2).c).f).setText((String) obj);
                break;
            case 17:
                String str2 = (String) obj;
                str2.getClass();
                ((TextView) ((em0) ((ngr) obj2).c).X).setText(str2);
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                String str3 = (String) obj;
                uhs uhsVar = (uhs) obj2;
                str3.getClass();
                ((TextView) uhsVar.e.d).setText(str3);
                ((TextView) uhsVar.d.Y).setText(str3);
                break;
            case 22:
                String str4 = (String) obj;
                lvs lvsVar = (lvs) obj2;
                arl arlVar = lvsVar.c;
                vas vasVar = new vas(lvsVar, (byte) 21);
                Space space = arlVar.d;
                ArtworkShadow artworkShadow = arlVar.c;
                ArtworkView artworkView = arlVar.b;
                if (str4 == null || str4.length() == 0) {
                    artworkView.setVisibility(8);
                    artworkShadow.setVisibility(8);
                    arlVar.e.setVisibility(0);
                    space.getLayoutParams().G = null;
                } else {
                    artworkView.setVisibility(0);
                    artworkShadow.setVisibility(0);
                    artworkShadow.b(artworkView, false);
                    space.getLayoutParams().G = arlVar.a.getContext().getString(2131956518);
                }
                artworkView.n(vasVar);
                artworkView.h(new k07(new g07(str4), true));
                break;
            default:
                String str5 = (String) obj;
                s880 s880Var = (s880) ((odr) obj2).c;
                if (str5 == null || str5.length() == 0) {
                    ((TextView) s880Var.f).setVisibility(8);
                } else {
                    ((TextView) s880Var.f).setVisibility(0);
                    ((TextView) s880Var.f).setText(str5);
                }
                break;
        }
    }

    public /* synthetic */ vun(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public vun(y4s y4sVar) {
        this.a = (byte) 14;
        this.b = rqt0.u(y4sVar.b);
    }

    public vun() {
        this.a = (byte) 26;
        this.b = new hja1(x760.a);
    }

    public void g(Drawable drawable) {
    }
}
