package p;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oly extends dy81 {
    public final /* synthetic */ byte h = 1;
    public final gpr0 i;
    public final gpr0 j;
    public final boolean k;
    public final long l;
    public ParagraphView m;
    public ParagraphView n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Serializable f26p;

    public oly(gpr0 gpr0Var, gpr0 gpr0Var2, Bitmap bitmap, String str, boolean z, long j) {
        super(new nj41(3335 + j), new f3a(2131625016, 2131429002));
        this.i = gpr0Var;
        this.j = gpr0Var2;
        this.o = bitmap;
        this.f26p = str;
        this.k = z;
        this.l = j;
    }

    public static AnimatorSet i(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(jon1.n(view, 0.0f, 667L, 0L, new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f), 11));
        return animatorSet;
    }

    @Override // p.dy81
    public final void d(ConstraintLayout constraintLayout) {
        byte b = this.h;
        gpr0 gpr0Var = this.j;
        gpr0 gpr0Var2 = this.i;
        Object obj = this.o;
        switch (b) {
            case 0:
                ParagraphView paragraphViewN = b8k1.n(constraintLayout, 2131428686);
                paragraphViewN.x(gpr0Var2);
                this.m = paragraphViewN;
                ParagraphView paragraphViewN2 = b8k1.n(constraintLayout, 2131428689);
                paragraphViewN2.x(gpr0Var);
                this.n = paragraphViewN2;
                LinearLayout linearLayout = (LinearLayout) b8k1.n(constraintLayout, 2131428688);
                List<ciy> list = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (ciy ciyVar : list) {
                    ConstraintLayout constraintLayoutInflate = LayoutInflater.from(constraintLayout.getContext()).inflate(2131624590, (ViewGroup) linearLayout, false);
                    ImageView imageView = (ImageView) b8k1.n(constraintLayoutInflate, 2131428684);
                    ParagraphView paragraphViewN3 = b8k1.n(constraintLayoutInflate, 2131428685);
                    biy biyVar = new biy(imageView, paragraphViewN3);
                    imageView.setImageBitmap(ciyVar.a);
                    paragraphViewN3.x(ciyVar.b);
                    linearLayout.addView(constraintLayoutInflate);
                    arrayList.add(biyVar);
                }
                this.f26p = arrayList;
                super.d(constraintLayout);
                return;
            default:
                ImageView imageView2 = (ImageView) b8k1.n(constraintLayout, 2131429002);
                TextView textView = (TextView) b8k1.n(constraintLayout, 2131431087);
                this.m = b8k1.n(constraintLayout, 2131429004);
                this.n = b8k1.n(constraintLayout, 2131429003);
                imageView2.setImageBitmap((Bitmap) obj);
                textView.setText((String) this.f26p);
                ParagraphView paragraphView = this.m;
                if (paragraphView == null) {
                    u890.C("sceneTitle");
                    throw null;
                }
                paragraphView.x(gpr0Var2);
                ParagraphView paragraphView2 = this.n;
                if (paragraphView2 == null) {
                    u890.C("sceneSubtitle");
                    throw null;
                }
                paragraphView2.x(gpr0Var);
                super.d(constraintLayout);
                return;
        }
    }

    @Override // p.dy81
    public final n381 h(ConstraintLayout constraintLayout) {
        byte b = this.h;
        boolean z = this.k;
        switch (b) {
            case 0:
                byte b2 = 1;
                AnimatorSet animatorSet = new AnimatorSet();
                ParagraphView paragraphView = this.m;
                if (paragraphView == null) {
                    u890.C("headerView");
                    throw null;
                }
                ParagraphView paragraphView2 = this.n;
                if (paragraphView2 == null) {
                    u890.C("subtitleView");
                    throw null;
                }
                ArrayList arrayList = (ArrayList) this.f26p;
                if (arrayList == null) {
                    u890.C("itemViews");
                    throw null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                List listM = p7h.M(new ParagraphView[]{paragraphView, paragraphView2});
                c8b1 c8b1Var = new c8b1(2);
                List<ParagraphView> list = listM;
                ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                for (ParagraphView paragraphView3 : list) {
                    long j = 666;
                    if (!u890.j(paragraphView3, paragraphView) && u890.j(paragraphView3, paragraphView2)) {
                        j = 833;
                    }
                    long j2 = j;
                    glv.a.getClass();
                    arrayList2.add(jon1.l(paragraphView3, 0L, j2, elv.b, new mly(this, (byte) 0), 17));
                    paragraphView = paragraphView;
                }
                c8b1Var.b(arrayList2.toArray(new Animator[0]));
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    biy biyVar = (biy) next;
                    Iterator it2 = it;
                    long j3 = ((long) i2) * 167;
                    ImageView imageView = biyVar.a;
                    View view = biyVar.b;
                    View[] viewArr = new View[2];
                    viewArr[0] = imageView;
                    viewArr[b2] = view;
                    List listM2 = p7h.M(viewArr);
                    ArrayList arrayList4 = new ArrayList(q7h.U(listM2, 10));
                    Iterator it3 = listM2.iterator();
                    while (it3.hasNext()) {
                        View view2 = (View) it3.next();
                        glv.a.getClass();
                        ValueAnimator valueAnimatorL = jon1.l(view2, j3, 833L, elv.b, new mly(this, b2), 16);
                        valueAnimatorL.addListener(new nly(view2, (byte) 0));
                        arrayList4.add(valueAnimatorL);
                        z = z;
                        it3 = it3;
                        b2 = 1;
                    }
                    r7h.W(arrayList4, arrayList3);
                    it = it2;
                    i = i2;
                    b2 = 1;
                }
                boolean z2 = z;
                animatorSet3.playTogether(arrayList3);
                c8b1Var.a(animatorSet3);
                ArrayList arrayList5 = c8b1Var.a;
                animatorSet2.playTogether((Animator[]) arrayList5.toArray(new Animator[arrayList5.size()]));
                animatorSet2.addListener(new kws(this, listM, (byte) 1));
                ParagraphView paragraphView4 = this.m;
                if (paragraphView4 == null) {
                    u890.C("headerView");
                    throw null;
                }
                ParagraphView paragraphView5 = this.n;
                if (paragraphView5 == null) {
                    u890.C("subtitleView");
                    throw null;
                }
                ArrayList arrayList6 = (ArrayList) this.f26p;
                if (arrayList6 == null) {
                    u890.C("itemViews");
                    throw null;
                }
                glv.a.getClass();
                animatorSet.playSequentially(animatorSet2, jon1.h(this.l, 500L, elv.c, Collections.singletonList(new i5k(oxx.i, new ssm((Object) paragraphView4, (Object) paragraphView5, (Object) this, (byte) 28), new djx((Object) paragraphView4, (Object) paragraphView5, (Object) arrayList6, (byte) 2)))));
                animatorSet.addListener(new otd(this, (byte) 2));
                AnimatorSet animatorSet4 = z2 ? animatorSet : null;
                if (animatorSet4 == null) {
                    animatorSet4 = new AnimatorSet();
                }
                return new n381(animatorSet4, new ogr(this, (byte) 25), (byte) 10);
            default:
                this.m = b8k1.n(constraintLayout, 2131429004);
                this.n = b8k1.n(constraintLayout, 2131429003);
                ImageView imageView2 = (ImageView) b8k1.n(constraintLayout, 2131429002);
                CardView cardViewN = b8k1.n(constraintLayout, 2131431086);
                AnimatorSet animatorSet5 = new AnimatorSet();
                AnimatorSet animatorSetM = jon1.M(imageView2);
                ParagraphView paragraphView6 = this.m;
                if (paragraphView6 == null) {
                    u890.C("sceneTitle");
                    throw null;
                }
                AnimatorSet animatorSetE = jon1.e(p7h.M(new AnimatorSet[]{animatorSetM, jon1.M(paragraphView6)}), 0L, (TimeInterpolator) null, (Long) null, this.k, 14);
                AnimatorSet animatorSetE2 = jon1.e(Collections.singletonList(jon1.M(cardViewN)), 667L, (TimeInterpolator) null, (Long) null, this.k, 12);
                ParagraphView paragraphView7 = this.n;
                if (paragraphView7 == null) {
                    u890.C("sceneSubtitle");
                    throw null;
                }
                AnimatorSet animatorSetM2 = jon1.M(paragraphView7);
                AnimatorSet animatorSet6 = new AnimatorSet();
                animatorSet6.setStartDelay(this.l);
                AnimatorSet animatorSetI = i(imageView2);
                ParagraphView paragraphView8 = this.m;
                if (paragraphView8 == null) {
                    u890.C("sceneTitle");
                    throw null;
                }
                AnimatorSet animatorSetI2 = i(paragraphView8);
                ParagraphView paragraphView9 = this.n;
                if (paragraphView9 == null) {
                    u890.C("sceneSubtitle");
                    throw null;
                }
                animatorSet5.playSequentially(animatorSetE, animatorSetE2, animatorSetM2, animatorSet6, jon1.e(p7h.M(new AnimatorSet[]{animatorSetI, animatorSetI2, i(paragraphView9), i(cardViewN)}), 0L, (TimeInterpolator) null, 667L, this.k, 6));
                AnimatorSet animatorSet7 = z ? animatorSet5 : null;
                if (animatorSet7 == null) {
                    animatorSet7 = new AnimatorSet();
                }
                return new n381(animatorSet7, new lc20(imageView2, cardViewN, this, (byte) 16), (byte) 10);
        }
    }

    public oly(gpr0 gpr0Var, gpr0 gpr0Var2, List list, long j, boolean z) {
        super(new nj41(2168 + j), new f3a(2131624591, 2131428686));
        this.i = gpr0Var;
        this.j = gpr0Var2;
        this.o = list;
        this.l = j;
        this.k = z;
    }
}
