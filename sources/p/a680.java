package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.collection2.itemdata.proto.CollectionItemdata;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.heart.HeartButton;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.list_collection.save_source.proto.SaveSource;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.prefs.esperanto.proto.EsPrefs;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import spotify.collection.esperanto.proto.CollectionAddRemoveItem;
import spotify.collection.esperanto.proto.CollectionAddRemoveItemsRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a680 implements cy81, dl4, h701, puu {
    public static a680 h;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public static final ejb g = new ejb((byte) 13);
    public static final huz i = new huz((Object) null, (byte) 10);

    public a680(byte b) {
        switch (b) {
            case 26:
                break;
            default:
                this.a = new int[]{2131230915, 2131230913, 2131230838};
                this.b = new int[]{2131230862, 2131230898, 2131230869, 2131230864, 2131230865, 2131230868, 2131230867};
                this.c = new int[]{2131230912, 2131230914, 2131230855, 2131230908, 2131230909, 2131230910, 2131230911};
                this.d = new int[]{2131230888, 2131230853, 2131230887};
                this.e = new int[]{2131230906, 2131230916};
                this.f = new int[]{2131230841, 2131230847, 2131230842, 2131230848};
                break;
        }
    }

    public static boolean B(Context context, int i2, Drawable drawable) {
        if (i2 == 2131230899) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
            int iC = kfe1.c(context, 2130969012);
            PorterDuff.Mode mode = ck5.b;
            x(drawableFindDrawableByLayerId, iC, mode);
            x(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), kfe1.c(context, 2130969012), mode);
            x(layerDrawable.findDrawableByLayerId(R.id.progress), kfe1.c(context, 2130969010), mode);
            return true;
        }
        if (i2 != 2131230890 && i2 != 2131230889 && i2 != 2131230891) {
            return false;
        }
        LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
        Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.background);
        int iB = kfe1.b(context, 2130969012);
        PorterDuff.Mode mode2 = ck5.b;
        x(drawableFindDrawableByLayerId2, iB, mode2);
        x(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), kfe1.c(context, 2130969010), mode2);
        x(layerDrawable2.findDrawableByLayerId(R.id.progress), kfe1.c(context, 2130969010), mode2);
        return true;
    }

    public static CollectionPlatformItemsRequest D(List list, w5h w5hVar) {
        u4h u4hVarQ = CollectionPlatformItemsRequest.q();
        u4hVarQ.n(list);
        u4hVarQ.t(w5hVar);
        return u4hVarQ.build();
    }

    public static CollectionAddRemoveItemsRequest E(List list, tv80 tv80Var) {
        CollectionItemdata.ItemData itemData;
        if (tv80Var != null) {
            h4h h4hVarT = CollectionItemdata.ItemData.t();
            oc41 oc41VarP = SaveSource.p();
            oc41VarP.n(tv80Var.a.a);
            h4hVarT.q(oc41VarP);
            itemData = (CollectionItemdata.ItemData) h4hVarT.build();
        } else {
            itemData = null;
        }
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (String str : list2) {
            b0h b0hVarN = CollectionAddRemoveItem.n();
            b0hVarN.r(str);
            if (itemData != null) {
                b0hVarN.n(itemData);
            }
            arrayList.add(b0hVarN.build());
        }
        c0h c0hVarQ = CollectionAddRemoveItemsRequest.q();
        c0hVarQ.n(arrayList);
        return c0hVarQ.build();
    }

    public static boolean c(int i2, int[] iArr) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList e(Context context, int i2) {
        int iC = kfe1.c(context, 2130969011);
        int iB = kfe1.b(context, 2130969008);
        int[] iArr = kfe1.b;
        int[] iArr2 = kfe1.d;
        int i3 = uah.i(iC, i2);
        return new ColorStateList(new int[][]{iArr, iArr2, kfe1.c, kfe1.f}, new int[]{iB, i3, uah.i(iC, i2), i2});
    }

    public static LayerDrawable f(ex21 ex21Var, Context context, int i2) {
        if (i2 == 2131230854) {
            return new LayerDrawable(new Drawable[]{ex21Var.d(context, 2131230853), ex21Var.d(context, 2131230855)});
        }
        if (i2 == 2131230890) {
            return k(ex21Var, context, 2131165243);
        }
        if (i2 == 2131230889) {
            return k(ex21Var, context, 2131165244);
        }
        if (i2 == 2131230891) {
            return k(ex21Var, context, 2131165245);
        }
        return null;
    }

    public static LayerDrawable k(ex21 ex21Var, Context context, int i2) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
        Drawable drawableD = ex21Var.d(context, 2131230902);
        Drawable drawableD2 = ex21Var.d(context, 2131230903);
        if ((drawableD instanceof BitmapDrawable) && drawableD.getIntrinsicWidth() == dimensionPixelSize && drawableD.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableD;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableD.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableD2 instanceof BitmapDrawable) && drawableD2.getIntrinsicWidth() == dimensionPixelSize && drawableD2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableD2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableD2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    public static PorterDuff.Mode o(int i2) {
        if (i2 == 2131230904) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    public static a680 r(LayoutInflater layoutInflater) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131624498, (ViewGroup) null, false);
        int i2 = 2131427521;
        AddToButtonView addToButtonViewT = m5n1.t(constraintLayoutInflate, 2131427521);
        if (addToButtonViewT != null) {
            ConstraintLayout constraintLayout = constraintLayoutInflate;
            i2 = 2131428234;
            ContextMenuButton contextMenuButtonT = m5n1.t(constraintLayoutInflate, 2131428234);
            if (contextMenuButtonT != null) {
                i2 = 2131428536;
                TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131428536);
                if (textView != null) {
                    i2 = 2131429106;
                    HeartButton heartButtonT = m5n1.t(constraintLayoutInflate, 2131429106);
                    if (heartButtonT != null) {
                        i2 = 2131429979;
                        if (m5n1.t(constraintLayoutInflate, 2131429979) != null) {
                            i2 = 2131430400;
                            PlayButtonView playButtonViewT = m5n1.t(constraintLayoutInflate, 2131430400);
                            if (playButtonViewT != null) {
                                return new a680(constraintLayout, addToButtonViewT, contextMenuButtonT, textView, heartButtonT, playButtonViewT);
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i2)));
        return null;
    }

    public static void x(Drawable drawable, int i2, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = ck5.b;
        }
        drawableMutate.setColorFilter(ck5.c(i2, mode));
    }

    public void A(int i2, iu30 iu30Var) {
        dg30 dg30Var = (dg30) this.d;
        er91 er91Var = new er91((fs91) null, dg30Var.getString(i2), (Integer) null, dg30Var.getString(2131959894), (Integer) null, new v20((byte) 10, this, iu30Var), (cvr) null, (xq91) null, false);
        kt91 kt91Var = (kt91) this.c;
        if (kt91Var.g()) {
            kt91Var.k(er91Var);
        } else {
            kt91Var.o(er91Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068 A[RETURN] */
    public boolean C(Context context, int i2, Drawable drawable) {
        int i3;
        boolean z;
        int iRound;
        Drawable drawableMutate;
        PorterDuff.Mode mode = ck5.b;
        if (c(i2, (int[]) this.a)) {
            i3 = 2130969012;
        } else if (c(i2, (int[]) this.c)) {
            i3 = 2130969010;
        } else {
            if (!c(i2, (int[]) this.d)) {
                if (i2 == 2131230875) {
                    iRound = Math.round(40.8f);
                    i3 = 16842800;
                    z = true;
                } else {
                    if (i2 != 2131230857) {
                        i3 = 0;
                        z = false;
                    }
                    iRound = -1;
                }
                if (z) {
                    return false;
                }
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(ck5.c(kfe1.c(context, i3), mode));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                return true;
            }
            mode = PorterDuff.Mode.MULTIPLY;
            i3 = 16842801;
        }
        z = true;
        iRound = -1;
        if (z) {
            return false;
        }
        drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(ck5.c(kfe1.c(context, i3), mode));
        if (iRound != -1) {
            drawableMutate.setAlpha(iRound);
        }
        return true;
    }

    public void a() {
        mxr mxrVar = (mxr) this.b;
        String str = (String) this.c;
        tmb tmbVar = (umb) this.d;
        lik1 lik1Var = (lik1) this.e;
        drj0 drj0Var = (drj0) this.f;
        ytg ytgVar = new ytg(0, (xab1) this.a, faa0.class, "cancel", "cancel(Ljava/util/concurrent/CancellationException;)V", 0, (byte) 1);
        mxr mxrVar2 = (mxr) mxrVar.d;
        vt1 vt1Var = new vt1(mxrVar, str, lik1Var, drj0Var, ytgVar, (byte) 14);
        l78 l78Var = (l78) mxrVar2.a;
        if (tmbVar == null) {
            tmbVar = tmb.a;
        }
        mxrVar2.d = l78Var.a(str).flatMapObservable(new ow3(l78Var, tmbVar, (byte) 23)).onErrorReturnItem(tmbVar).first(tmbVar).observeOn((Scheduler) mxrVar2.c).subscribe(new qg7(vt1Var, mxrVar2, str, (byte) 7), new cfs(vt1Var, (byte) 14));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r5.b(p.k6n.a, r7, r0) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(int r6, p.onm r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p.zzu
            if (r0 == 0) goto L13
            r0 = r7
            p.zzu r0 = (p.zzu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.zzu r0 = new p.zzu
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            p.hm5.M(r7)
            goto L5c
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L31:
            int r6 = r0.a
            p.hm5.M(r7)
            goto L46
        L37:
            p.hm5.M(r7)
            r0.a = r6
            r0.d = r3
            r7 = 0
            java.lang.Object r7 = r5.h(r7, r0)
            if (r7 != r4) goto L46
            goto L5b
        L46:
            java.lang.Object r5 = r5.b
            p.b7n r5 = (p.b7n) r5
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            r0.a = r6
            r0.d = r2
            p.k6n r6 = p.k6n.a
            java.lang.Object r5 = r5.b(r6, r7, r0)
            if (r5 != r4) goto L5c
        L5b:
            return r4
        L5c:
            p.rih1 r5 = p.rih1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a680.b(int, p.onm):java.lang.Object");
    }

    public js20 d(xpw xpwVar) {
        no5 no5Var = (no5) this.b;
        dym0 dym0Var = new dym0(this, (byte) 0);
        dym0 dym0Var2 = new dym0(this, (byte) 1);
        dym0 dym0Var3 = new dym0(this, (byte) 2);
        xjm0 xjm0Var = xjm0.Z0;
        fym0 fym0Var = new fym0(this, (lnm) null, (byte) 0);
        return x3p1.n(new tjf0((Object) no5Var, (Object) dym0Var3, (Object) dym0Var, (Object) dym0Var2, (Object) xjm0Var, (byte) 20), ec61.b1, qr51.Y0, (o8n) null, new q961(new lcm(fym0Var, (lnm) null, (byte) 15), (byte) 8), 8);
    }

    public qtw element() {
        n6r0 n6r0Var = (n6r0) this.a;
        iac0 iac0Var = (iac0) this.b;
        v5q v5qVar = (v5q) this.e;
        fbg1 fbg1Var = (fbg1) v5qVar.ta.get();
        lik1 lik1Var = (lik1) this.c;
        gn10 gn10Var = (gn10) this.d;
        return xcz0.m(n6r0Var, iac0Var, fbg1Var, new f701(gn10Var, lik1Var), new k55(false, false, (luk) v5qVar.b.L1.get()), ((uag1) v5qVar.G6.get()).a(), (q701) ((jly0) this.f).get(), ((hbg1) v5qVar.K6.get()).a(n6r0Var, new f701(gn10Var, lik1Var), iac0Var, (hyy0) null), (s801) v5qVar.H6.get(), (jz51) v5qVar.I6.get());
    }

    public lo9 g() {
        luk lukVar = (luk) ((ozp) this.a).a.L1.get();
        c8o.l(lukVar);
        return new lo9(lukVar);
    }

    public Object h(boolean z, onm onmVar) {
        fqz fqzVarP = EsPrefs.SetParams.p();
        iqz iqzVarR = EsPrefs.Value.r();
        iqzVarR.n(z);
        fqzVarP.n("audio.resync_bitrate_v2", iqzVarR.build());
        EsPrefs.SetParams setParamsBuild = fqzVarP.build();
        pov0 pov0Var = (pov0) this.a;
        setParamsBuild.getClass();
        Object objJ = fc11.j(pov0Var.callSingle("spotify.prefs.esperanto.proto.Prefs", "Set", setParamsBuild).map(a020.d1), onmVar);
        return objJ == d9n.a ? objJ : rih1.a;
    }

    public ArrayList i() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList((LinkedHashSet) this.c);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(onm onmVar) {
        a0v a0vVar;
        if (onmVar instanceof a0v) {
            a0vVar = (a0v) onmVar;
            int i2 = a0vVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a0vVar.c = i2 - Integer.MIN_VALUE;
            } else {
                a0vVar = new a0v(this, onmVar);
            }
        } else {
            a0vVar = new a0v(this, onmVar);
        }
        Object objJ = a0vVar.a;
        int i3 = a0vVar.c;
        if (i3 == 0) {
            hm5.M(objJ);
            Single map = ((vpp0) this.c).b(EsOffline.GetContextsRequest.p()).map(pbo1.Y0);
            a0vVar.c = 1;
            objJ = fc11.j(map, a0vVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }

    public ArrayList l() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.b) {
            arrayList = new ArrayList();
            arrayList.addAll(i());
            synchronized (this.b) {
                arrayList2 = new ArrayList((LinkedHashSet) this.e);
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public Object m(b680 b680Var, ArrayList arrayList) {
        Object objB;
        Object objB2;
        Class cls = (Class) this.b;
        if (!dhn.a.contains(this)) {
            try {
                Object objB3 = c680.B((Class) this.a, (Object) null, (Method) this.c, new Object[0]);
                if (objB3 != null && (objB = c680.B(cls, objB3, (Method) this.d, new Object[]{b680Var.a})) != null && (objB2 = c680.B(cls, objB, (Method) this.e, new Object[]{arrayList})) != null) {
                    return c680.B(cls, objB2, (Method) this.f, new Object[0]);
                }
            } catch (Throwable th) {
                dhn.a(this, th);
                return null;
            }
        }
        return null;
    }

    public ColorStateList n(Context context, int i2) {
        if (i2 == 2131230858) {
            return x74.E(context, 2131099669);
        }
        if (i2 == 2131230905) {
            return x74.E(context, 2131099672);
        }
        if (i2 != 2131230904) {
            if (i2 == 2131230846) {
                return e(context, kfe1.c(context, 2130969008));
            }
            if (i2 == 2131230840) {
                return e(context, 0);
            }
            if (i2 == 2131230845) {
                return e(context, kfe1.c(context, 2130969006));
            }
            if (i2 == 2131230900 || i2 == 2131230901) {
                return x74.E(context, 2131099671);
            }
            if (c(i2, (int[]) this.b)) {
                return kfe1.d(context, 2130969012);
            }
            if (c(i2, (int[]) this.e)) {
                return x74.E(context, 2131099668);
            }
            if (c(i2, (int[]) this.f)) {
                return x74.E(context, 2131099667);
            }
            if (i2 == 2131230897) {
                return x74.E(context, 2131099670);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = kfe1.d(context, 2130969043);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = kfe1.b;
            iArr2[0] = kfe1.b(context, 2130969043);
            iArr[1] = kfe1.e;
            iArr2[1] = kfe1.c(context, 2130969010);
            iArr[2] = kfe1.f;
            iArr2[2] = kfe1.c(context, 2130969043);
        } else {
            int[] iArr3 = kfe1.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = kfe1.e;
            iArr2[1] = kfe1.c(context, 2130969010);
            iArr[2] = kfe1.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public uv61 p(txm0 txm0Var) {
        return ((xv61) this.c).a(rc11.a.b(ivw0.class), txm0Var.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public Object q(Context context, onm onmVar) {
        obg obgVar;
        Object objB;
        cce cceVar = (cce) this.a;
        lzn0 lzn0Var = (lzn0) cceVar.c;
        if (onmVar instanceof obg) {
            obgVar = (obg) onmVar;
            int i2 = obgVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                obgVar.c = i2 - Integer.MIN_VALUE;
            } else {
                obgVar = new obg(this, onmVar);
            }
        } else {
            obgVar = new obg(this, onmVar);
        }
        Object obj = obgVar.a;
        int i3 = obgVar.c;
        boolean z = true;
        if (i3 == 0) {
            hm5.M(obj);
            if (((rf4) ((dg8) this.d).b).b()) {
                dn81 dn81Var = (dn81) this.b;
                obgVar.c = 1;
                objB = dn81Var.b(obgVar);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                x6h1 x6h1VarC = ((dsk0) this.f).b.c();
                x6h1VarC.i.add(new a7h1("downgrade_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                ((i8h1) ((z1p) this.e).get()).m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "https://www.spotify.com/redirect/generic/?redirect_key=android_churn_locked_state_cancel_subscription&utm_source=spotify&utm_medium=lockedstate&utm_campaign=android_cls")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ybg ybgVar = (ybg) cceVar.d;
                l1d.B(ybgVar.c, ybgVar.b.edit(), ybg.d);
                lzn0Var.d(blc0.L3);
                context.startActivity(swv0.b((swv0) cceVar.b, context, new rwv0(exf.b, "Cancel subscription", Uri.parse("https://www.spotify.com/redirect/generic/?redirect_key=android_churn_locked_state_cancel_subscription&utm_source=spotify&utm_medium=lockedstate&utm_campaign=android_cls"))));
            }
            return Boolean.valueOf(z);
        }
        if (i3 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        objB = ((e331) obj).a;
        boolean z2 = objB instanceof m231;
        z = !z2;
        if (!z2) {
            ybg ybgVar2 = (ybg) ((xid) this.c).b;
            l1d.B(ybgVar2.c, ybgVar2.b.edit(), ybg.d);
            lzn0Var.d(blc0.L3);
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (b(r7, r0) == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object s(p.km61 r6, int r7, p.onm r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p.b0v
            if (r0 == 0) goto L13
            r0 = r8
            p.b0v r0 = (p.b0v) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.b0v r0 = new p.b0v
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            p.rih1 r2 = p.rih1.a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L37
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2c
            int r7 = r0.a
            p.hm5.M(r8)
            goto L4d
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L33:
            p.hm5.M(r8)
            return r2
        L37:
            p.hm5.M(r8)
            r8 = 5
            p.d9n r1 = p.d9n.a
            if (r7 == r8) goto L68
            r8 = 6
            if (r7 == r8) goto L68
            r0.a = r7
            r0.d = r3
            java.lang.Object r6 = r5.b(r7, r0)
            if (r6 != r1) goto L4d
            goto L72
        L4d:
            java.lang.Object r6 = r5.d
            p.kt91 r6 = (p.kt91) r6
            java.lang.Object r5 = r5.e
            android.content.Context r5 = (android.content.Context) r5
            java.lang.String r7 = p.wzu.a(r5, r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            r8 = 2131953022(0x7f13057e, float:1.9542503E38)
            java.lang.String r5 = r5.getString(r8, r7)
            p.wzu.d(r6, r5)
            return r2
        L68:
            r0.a = r7
            r0.d = r4
            java.lang.Object r5 = r5.y(r6, r7, r0)
            if (r5 != r1) goto L73
        L72:
            return r1
        L73:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a680.s(p.km61, int, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object t(km61 km61Var, Integer num, int i2, onm onmVar) {
        c0v c0vVar;
        if (onmVar instanceof c0v) {
            c0vVar = (c0v) onmVar;
            int i3 = c0vVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0vVar.f = i3 - Integer.MIN_VALUE;
            } else {
                c0vVar = new c0v(this, onmVar);
            }
        } else {
            c0vVar = new c0v(this, onmVar);
        }
        Object objI = c0vVar.d;
        int i4 = c0vVar.f;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i4 == 0) {
            hm5.M(objI);
            mr20 mr20VarA = ((b7n) this.b).a(k6n.a);
            c0vVar.a = km61Var;
            c0vVar.b = num;
            c0vVar.c = i2;
            c0vVar.f = 1;
            objI = b5p1.i(mr20VarA, c0vVar);
            if (objI != d9nVar) {
            }
            return d9nVar;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                hm5.M(objI);
                return rih1Var;
            }
            if (i4 == 3) {
                hm5.M(objI);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = c0vVar.c;
        num = c0vVar.b;
        km61Var = c0vVar.a;
        hm5.M(objI);
        if (((Number) objI).intValue() != i2) {
            if (((t7f0) ((ps7) this.f).b).a()) {
                c0vVar.a = null;
                c0vVar.b = null;
                c0vVar.c = i2;
                c0vVar.f = 2;
                if (s(km61Var, i2, c0vVar) == d9nVar) {
                    return d9nVar;
                }
            } else {
                c0vVar.a = null;
                c0vVar.b = null;
                c0vVar.c = i2;
                c0vVar.f = 3;
                if (u(km61Var, num, i2, c0vVar) == d9nVar) {
                    return d9nVar;
                }
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object u(km61 km61Var, Integer num, int i2, onm onmVar) {
        d0v d0vVar;
        int i3;
        int i4;
        int i5;
        km61 km61Var2;
        km61 km61Var3 = km61Var;
        int i6 = i2;
        if (onmVar instanceof d0v) {
            d0vVar = (d0v) onmVar;
            int i7 = d0vVar.h;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                d0vVar.h = i7 - Integer.MIN_VALUE;
            } else {
                d0vVar = new d0v(this, onmVar);
            }
        } else {
            d0vVar = new d0v(this, onmVar);
        }
        Object objJ = d0vVar.f;
        int i8 = d0vVar.h;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i8 != 0) {
            if (i8 == 1) {
                hm5.M(objJ);
                return rih1Var;
            }
            if (i8 == 2) {
                int i9 = d0vVar.e;
                int i10 = d0vVar.d;
                i3 = d0vVar.c;
                int i11 = d0vVar.b;
                km61 km61Var4 = d0vVar.a;
                hm5.M(objJ);
                i5 = i9;
                i4 = i10;
                i6 = i11;
                km61Var3 = km61Var4;
            } else {
                if (i8 != 3) {
                    if (i8 == 4) {
                        hm5.M(objJ);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                km61Var2 = d0vVar.a;
                hm5.M(objJ);
            }
            if (((Number) objJ).intValue() > 0) {
                km61.a(km61Var2, "resync", (Bundle) null, false, 6);
                return rih1Var;
            }
            return rih1Var;
        }
        hm5.M(objJ);
        i3 = (num == null || i6 <= num.intValue()) ? 0 : 1;
        i4 = i6 == 5 ? 1 : 0;
        i5 = i6 == 6 ? 1 : 0;
        if (i3 != 0 && (i4 != 0 || i5 != 0)) {
            d0vVar.a = null;
            d0vVar.b = i6;
            d0vVar.c = i3;
            d0vVar.d = i4;
            d0vVar.e = i5;
            d0vVar.h = 1;
            if (y(km61Var3, i6, d0vVar) == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        if (i3 != 0) {
            d0vVar.a = km61Var3;
            d0vVar.b = i6;
            d0vVar.c = i3;
            d0vVar.d = i4;
            d0vVar.e = i5;
            d0vVar.h = 2;
            if (b(i6, d0vVar) != d9nVar) {
            }
        } else {
            d0vVar.a = null;
            d0vVar.b = i6;
            d0vVar.c = i3;
            d0vVar.d = i4;
            d0vVar.e = i5;
            d0vVar.h = 4;
            if (b(i6, d0vVar) != d9nVar) {
                return rih1Var;
            }
        }
        return d9nVar;
        d0vVar.a = km61Var3;
        d0vVar.b = i6;
        d0vVar.c = i3;
        d0vVar.d = i4;
        d0vVar.e = i5;
        d0vVar.h = 3;
        objJ = j(d0vVar);
        if (objJ != d9nVar) {
            km61Var2 = km61Var3;
            if (((Number) objJ).intValue() > 0) {
                km61.a(km61Var2, "resync", (Bundle) null, false, 6);
                return rih1Var;
            }
            return rih1Var;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00da  */
    /* JADX WARN: Code duplicated, block: B:47:0x00de  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:52:0x010c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0116  */
    /* JADX WARN: Code duplicated, block: B:58:0x0124  */
    /* JADX WARN: Code duplicated, block: B:61:0x015a  */
    /* JADX WARN: Code duplicated, block: B:63:0x015e  */
    /* JADX WARN: Code duplicated, block: B:65:0x016c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0170  */
    /* JADX WARN: Code duplicated, block: B:69:0x017a  */
    /* JADX WARN: Code duplicated, block: B:71:0x017e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0182  */
    /* JADX WARN: Code duplicated, block: B:75:0x0192  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        if (r15 == r7) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object v(p.km61 r10, p.xxm0 r11, java.lang.Integer r12, p.qxm0 r13, p.tqw r14, p.onm r15) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a680.v(p.km61, p.xxm0, java.lang.Integer, p.qxm0, p.tqw, p.onm):java.lang.Object");
    }

    public void w(Object obj) {
        jnw jnwVar = (jnw) obj;
        jnwVar.Y1 = new znw((p2q) this.d, (byte) 0);
        jnwVar.X1 = (evl0) ((jly0) this.e).get();
        jnwVar.Z1 = (kg0) ((e3q) this.c).W0.get();
        jnwVar.V1 = (ohv0) ((daq) this.b).U5.get();
        jnwVar.W1 = (b2r0) ((jly0) this.f).get();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object y(km61 km61Var, int i2, onm onmVar) {
        e0v e0vVar;
        String str;
        if (onmVar instanceof e0v) {
            e0vVar = (e0v) onmVar;
            int i3 = e0vVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e0vVar.e = i3 - Integer.MIN_VALUE;
            } else {
                e0vVar = new e0v(this, onmVar);
            }
        } else {
            e0vVar = new e0v(this, onmVar);
        }
        Object objI = e0vVar.c;
        int i4 = e0vVar.e;
        if (i4 == 0) {
            hm5.M(objI);
            mr20 mr20VarA = ((b7n) this.b).a(i6n.a);
            e0vVar.a = km61Var;
            e0vVar.b = i2;
            e0vVar.e = 1;
            objI = b5p1.i(mr20VarA, e0vVar);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i4 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = e0vVar.b;
            km61Var = e0vVar.a;
            hm5.M(objI);
        }
        boolean zBooleanValue = ((Boolean) objI).booleanValue();
        if (i2 == 6 && zBooleanValue) {
            str = "internalQualityDownloadCellularEnabledWarning";
        } else if (i2 == 6) {
            str = "internalQualityDownloadWarning";
        } else {
            str = zBooleanValue ? "losslessDownloadCellularEnabledWarning" : "losslessDownloadWarning";
        }
        km61.a(km61Var, str, (Bundle) null, false, 6);
        return rih1.a;
    }

    public void z() {
        bpb1 bpb1Var = (bpb1) this.c;
        EncoreButton encoreButton = (EncoreButton) this.d;
        ImageView imageView = (ImageView) this.f;
        ParagraphView paragraphView = (ParagraphView) this.a;
        paragraphView.setVisibility(0);
        oic oicVar = (oic) this.b;
        boolean z = oicVar.l;
        paragraphView.setAlpha(z ? 0.0f : 1.0f);
        paragraphView.x(oicVar.h);
        bpb1Var.m((Object) null, Boolean.valueOf(z));
        sgc1.x(oicVar.k, encoreButton, ((zda) oicVar).c, oicVar.n, bpb1Var, new sg0(1, (lnm) null, (byte) 5));
        encoreButton.setVisibility(z ? 4 : 0);
        encoreButton.setAlpha(z ? 0.0f : 1.0f);
        ImageView imageView2 = (ImageView) this.e;
        imageView2.setAlpha(1.0f);
        imageView2.setVisibility(0);
        imageView2.setImageBitmap(oicVar.i);
        imageView2.setClipToOutline(true);
        float f = z ? 0.0f : 1.0f;
        imageView2.setScaleX(f);
        imageView2.setScaleY(f);
        imageView.setAlpha(1.0f);
        imageView.setVisibility(0);
        imageView.setImageBitmap(oicVar.j);
    }

    public a680(swm0 swm0Var, uny unyVar, nbc nbcVar, oza0 oza0Var, her herVar, fdc fdcVar, o2b1 o2b1Var) {
        this.a = swm0Var;
        this.b = unyVar;
        this.c = oza0Var;
        this.d = herVar;
        this.e = fdcVar;
        this.f = o2b1Var;
    }

    public a680(pov0 pov0Var, b7n b7nVar, vpp0 vpp0Var, kt91 kt91Var, Context context, ps7 ps7Var, pob pobVar) {
        this.a = pov0Var;
        this.b = b7nVar;
        this.c = vpp0Var;
        this.d = kt91Var;
        this.e = context;
        this.f = ps7Var;
    }

    public a680(ccc0 ccc0Var, ijr ijrVar, kt91 kt91Var, dg30 dg30Var, q8n q8nVar) {
        this.a = ccc0Var;
        this.b = ijrVar;
        this.c = kt91Var;
        this.d = dg30Var;
        this.e = q8nVar;
        this.f = new idd1(new vv8(this, (byte) 6));
    }

    public a680(b7n b7nVar, no5 no5Var, xv61 xv61Var, pcl pclVar, i9i1 i9i1Var, teo0 teo0Var) {
        this.a = b7nVar;
        this.b = no5Var;
        this.c = xv61Var;
        this.d = pclVar;
        this.e = i9i1Var;
        this.f = teo0Var;
        new idd1(new zem0(this, (byte) 4));
    }

    public /* synthetic */ a680(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }
}
