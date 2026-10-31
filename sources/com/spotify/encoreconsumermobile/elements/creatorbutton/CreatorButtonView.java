package com.spotify.encoreconsumermobile.elements.creatorbutton;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.facepile.FacePileView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.af10;
import p.azo1;
import p.b2u;
import p.b8k1;
import p.bzn;
import p.czn;
import p.dzn;
import p.eg;
import p.fzn;
import p.gzn;
import p.hzn;
import p.ihc1;
import p.iu30;
import p.izn;
import p.jzn;
import p.kzn;
import p.lzn;
import p.mzn;
import p.nzn;
import p.o7h;
import p.ozn;
import p.q7h;
import p.szn;
import p.td10;
import p.tlv;
import p.tto1;
import p.tzn;
import p.u890;
import p.v20;
import p.v9w0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r*\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010'\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u0019\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001bR \u0010+\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010\u001f\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010!¨\u0006,"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/creatorbutton/CreatorButtonView;", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lp/bzn;", "Lp/rih1;", "setupMultiFacePileView", "(Ljava/util/List;)V", "Lp/td10;", "setupFacePileView", "(Lp/td10;)V", "Lp/szn;", "viewContext", "setViewContext", "(Lp/szn;)V", "Landroid/view/View;", "W0", "Landroid/view/View;", "getCreatorView", "()Landroid/view/View;", "creatorView", "Landroid/widget/TextView;", "Y0", "Landroid/widget/TextView;", "getDivider", "()Landroid/widget/TextView;", "divider", "Z0", "getViewYoursView", "getViewYoursView$annotations", "()V", "viewYoursView", "a1", "getEditPromptView", "getEditPromptView$annotations", "editPromptView", "src_main_java_com_spotify_encoreconsumermobile_elements_creatorbutton-creatorbutton"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CreatorButtonView extends ConstraintLayout implements tlv {
    public szn T0;
    public final TextView U0;
    public final FacePileView V0;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    public final View creatorView;
    public final FacePileView X0;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    public final TextView divider;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    public final View viewYoursView;

    /* JADX INFO: renamed from: a1, reason: from kotlin metadata */
    public final TextView editPromptView;

    /* JADX WARN: Multi-variable type inference failed */
    public CreatorButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, 2131624485, this);
        TextView textView = (TextView) b8k1.n(this, 2131428283);
        this.U0 = textView;
        FacePileView facePileView = (FacePileView) b8k1.n(this, 2131428819);
        this.V0 = facePileView;
        this.creatorView = b8k1.n(this, 2131428288);
        v9w0 v9w0VarO = b2u.o(facePileView);
        Collections.addAll(v9w0VarO.c, textView);
        v9w0VarO.a();
        this.divider = (TextView) b8k1.n(this, 2131428497);
        FacePileView facePileView2 = (FacePileView) b8k1.n(this, 2131431640);
        this.X0 = facePileView2;
        TextView textView2 = (TextView) b8k1.n(this, 2131431639);
        this.viewYoursView = b8k1.n(this, 2131431641);
        this.editPromptView = (TextView) b8k1.n(this, 2131428582);
        v9w0 v9w0VarO2 = b2u.o(facePileView2);
        Collections.addAll(v9w0VarO2.c, textView2);
        v9w0VarO2.a();
    }

    public static /* synthetic */ void getEditPromptView$annotations() {
    }

    public static /* synthetic */ void getViewYoursView$annotations() {
    }

    private final void setupFacePileView(td10 td10Var) {
        FacePileView facePileView = this.V0;
        if (td10Var == null) {
            facePileView.setVisibility(8);
            return;
        }
        List listSingletonList = Collections.singletonList(td10Var);
        if (!listSingletonList.isEmpty()) {
            listSingletonList.subList(1, listSingletonList.size());
        }
        szn sznVar = this.T0;
        if (sznVar == null) {
            u890.C("viewContext");
            throw null;
        }
        af10 af10Var = sznVar.a;
        tto1.s(af10Var.a, af10Var, facePileView.a, listSingletonList, facePileView.c, (List) null);
        facePileView.setVisibility(0);
    }

    private final void setupMultiFacePileView(List<bzn> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((bzn) obj).b != null) {
                arrayList.add(obj);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        FacePileView facePileView = this.V0;
        if (zIsEmpty) {
            facePileView.setVisibility(8);
            return;
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            td10 td10Var = ((bzn) it.next()).b;
            td10Var.getClass();
            arrayList2.add(td10Var);
        }
        if (!arrayList2.isEmpty()) {
            arrayList2.subList(1, arrayList2.size());
        }
        szn sznVar = this.T0;
        if (sznVar == null) {
            u890.C("viewContext");
            throw null;
        }
        af10 af10Var = sznVar.a;
        tto1.s(af10Var.a, af10Var, facePileView.a, arrayList2, facePileView.c, (List) null);
        facePileView.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void z(CreatorButtonView creatorButtonView, bzn bznVar) {
        creatorButtonView.setupFacePileView(bznVar.b);
        TextView textView = creatorButtonView.U0;
        String str = bznVar.a;
        int iP = azo1.p(creatorButtonView.getContext(), 2130968791);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(creatorButtonView.getContext().getString(2131960012, str));
        int iB0 = ihc1.B0(spannableStringBuilder, str, 0, 6);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(iP), 0, iB0, 33);
        spannableStringBuilder.setSpan(new StyleSpan(1), iB0, str.length() + iB0, 33);
        textView.setText(spannableStringBuilder);
        creatorButtonView.setContentDescription(creatorButtonView.getContext().getString(2131960012, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(List list, int i, iu30 iu30Var) {
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                B((bzn) o7h.q0(list));
                return;
            }
            setupMultiFacePileView(list);
            int size2 = list.size();
            TextView textView = this.U0;
            if (size2 == i) {
                List listD1 = o7h.d1(list, i);
                ArrayList arrayList = new ArrayList(q7h.U(listD1, 10));
                Iterator it = listD1.iterator();
                while (it.hasNext()) {
                    arrayList.add(((bzn) it.next()).a);
                }
                String str = (String) iu30Var.invoke(arrayList);
                textView.setText(str);
                setContentDescription(getContext().getResources().getString(2131960005, str));
                return;
            }
            List listD2 = o7h.d1(list, i);
            ArrayList arrayList2 = new ArrayList(q7h.U(listD2, 10));
            Iterator it2 = listD2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((bzn) it2.next()).a);
            }
            String str2 = (String) iu30Var.invoke(arrayList2);
            int size3 = list.size() - i;
            textView.setText(getContext().getResources().getQuantityString(2131820796, size3, str2, Integer.valueOf(size3)));
            setContentDescription(getContext().getResources().getQuantityString(2131820801, size3, str2, Integer.valueOf(size3)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(bzn bznVar) {
        setupFacePileView(bznVar.b);
        String str = bznVar.a;
        this.U0.setText(str);
        setContentDescription(getContext().getResources().getString(2131960005, str));
        boolean z = bznVar.c;
        View view = this.creatorView;
        view.setClickable(z);
        view.setEnabled(z);
    }

    public final View getCreatorView() {
        return this.creatorView;
    }

    public final TextView getDivider() {
        return this.divider;
    }

    public final TextView getEditPromptView() {
        return this.editPromptView;
    }

    public final View getViewYoursView() {
        return this.viewYoursView;
    }

    public final void n(iu30 iu30Var) {
        View view = this.creatorView;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new tzn(iu30Var, (byte) 0));
        } else {
            iu30Var.invoke(czn.b);
        }
        view.setOnClickListener(new v20(iu30Var, (byte) 20));
        this.viewYoursView.setOnClickListener(new v20(iu30Var, (byte) 21));
        v20 v20Var = new v20(iu30Var, (byte) 22);
        TextView textView = this.editPromptView;
        textView.setOnClickListener(v20Var);
        if (!textView.isLaidOut() || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new tzn(iu30Var, (byte) 1));
        } else {
            iu30Var.invoke(new dzn(textView));
        }
    }

    public final void setViewContext(szn viewContext) {
        this.T0 = viewContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void f(nzn nznVar) {
        if (!(nznVar instanceof kzn)) {
            if (nznVar instanceof hzn) {
                hzn hznVar = (hzn) nznVar;
                A(hznVar.a, hznVar.b, hznVar.c);
            } else if (nznVar instanceof lzn) {
                B(((lzn) nznVar).a);
            } else if (nznVar instanceof fzn) {
                z(this, ((fzn) nznVar).a);
            } else if (nznVar instanceof jzn) {
                ArrayList arrayList = ((jzn) nznVar).a;
                if (!arrayList.isEmpty()) {
                    setupMultiFacePileView(arrayList);
                    this.U0.setText(getContext().getString(2131960013, ((bzn) o7h.q0(arrayList)).a));
                }
            } else if (nznVar instanceof gzn) {
                gzn gznVar = (gzn) nznVar;
                bzn bznVar = gznVar.a;
                ozn oznVar = gznVar.b;
                z(this, bznVar);
                List listSingletonList = Collections.singletonList(oznVar.a);
                if (!listSingletonList.isEmpty()) {
                    listSingletonList.subList(1, listSingletonList.size());
                }
                szn sznVar = this.T0;
                if (sznVar == null) {
                    u890.C("viewContext");
                    throw null;
                }
                af10 af10Var = sznVar.a;
                FacePileView facePileView = this.X0;
                tto1.s(af10Var.a, af10Var, facePileView.a, listSingletonList, facePileView.c, (List) null);
                CharSequence contentDescription = getContentDescription();
                setContentDescription(((Object) contentDescription) + " " + getContext().getString(2131960015));
            } else if (nznVar instanceof mzn) {
                B(((mzn) nznVar).a);
            } else if (!(nznVar instanceof izn)) {
                eg.o();
                return;
            } else {
                izn iznVar = (izn) nznVar;
                A(iznVar.a, iznVar.b, iznVar.c);
            }
        }
        boolean z = nznVar instanceof gzn;
        int i = 0;
        this.divider.setVisibility((z || (nznVar instanceof mzn) || (nznVar instanceof izn)) ? 0 : 8);
        this.viewYoursView.setVisibility(z ? 0 : 8);
        if (!(nznVar instanceof mzn) && !(nznVar instanceof izn)) {
            i = 8;
        }
        this.editPromptView.setVisibility(i);
    }

    public CreatorButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CreatorButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CreatorButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
