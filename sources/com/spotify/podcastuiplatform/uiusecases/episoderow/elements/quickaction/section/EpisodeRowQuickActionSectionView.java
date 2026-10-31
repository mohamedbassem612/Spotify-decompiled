package com.spotify.podcastuiplatform.uiusecases.episoderow.elements.quickaction.section;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bbz;
import p.cbz;
import p.d7;
import p.ee71;
import p.eg;
import p.f0v;
import p.gsg0;
import p.iu30;
import p.kz1;
import p.o7h;
import p.sim;
import p.taz;
import p.tlv;
import p.tw20;
import p.u890;
import p.uaz;
import p.v2y;
import p.vaz;
import p.waz;
import p.xaz;
import p.yaz;
import p.zaz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/spotify/podcastuiplatform/uiusecases/episoderow/elements/quickaction/section/EpisodeRowQuickActionSectionView;", "", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/cbz;", "viewContext", "(Lp/cbz;)V", "", "enabled", "Lp/rih1;", "setEnabled", "(Z)V", "c", "Lp/cbz;", "getViewContext", "()Lp/cbz;", "setViewContext", "src_main_java_com_spotify_podcastuiplatform_uiusecases-uiusecases"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EpisodeRowQuickActionSectionView extends LinearLayout implements tlv {
    public final int a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public cbz viewContext;

    public EpisodeRowQuickActionSectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = context.getResources().getDimensionPixelSize(2131165971);
        this.b = context.getResources().getDimensionPixelSize(2131165970);
        setOrientation(0);
    }

    public static final void b(yaz yazVar, EpisodeRowQuickActionSectionView episodeRowQuickActionSectionView, boolean z) {
        f0v ee71Var;
        f0v f0vVar;
        cbz viewContext = episodeRowQuickActionSectionView.getViewContext();
        Context context = viewContext.a;
        if (yazVar instanceof vaz) {
            f0vVar = new f0v(viewContext);
        } else {
            if (yazVar instanceof waz) {
                ee71Var = new gsg0(context);
            } else if (yazVar instanceof taz) {
                ee71Var = new kz1(context);
            } else if (yazVar instanceof uaz) {
                ee71Var = new sim(context);
            } else {
                if (!(yazVar instanceof xaz)) {
                    eg.o();
                    return;
                }
                ee71Var = new ee71(context);
            }
            f0vVar = ee71Var;
        }
        if (z) {
            View view = new View(f0vVar.getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
            layoutParams.weight = 1.0f;
            view.setLayoutParams(layoutParams);
            episodeRowQuickActionSectionView.addView(view);
            int dimensionPixelSize = f0vVar.getContext().getResources().getDimensionPixelSize(2131165969);
            episodeRowQuickActionSectionView.setGravity(8388629);
            f0vVar.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        } else {
            int i = episodeRowQuickActionSectionView.a;
            f0vVar.setLayoutParams(new LinearLayout.LayoutParams(i, i));
            int i2 = episodeRowQuickActionSectionView.b;
            f0vVar.setPadding(i2, i2, i2, i2);
        }
        episodeRowQuickActionSectionView.addView(f0vVar);
        f0vVar.f(yazVar);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void f(bbz bbzVar) {
        removeAllViews();
        if (!bbzVar.d) {
            Iterator it = bbzVar.b.iterator();
            while (it.hasNext()) {
                b((yaz) it.next(), this, false);
            }
            return;
        }
        View space = new Space(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        space.setLayoutParams(layoutParams);
        addView(space);
        Iterator it2 = o7h.T0(bbzVar.c).iterator();
        while (it2.hasNext()) {
            b((yaz) it2.next(), this, false);
        }
    }

    public final cbz getViewContext() {
        cbz cbzVar = this.viewContext;
        if (cbzVar != null) {
            return cbzVar;
        }
        u890.C("viewContext");
        throw null;
    }

    public final void n(iu30 iu30Var) {
        int i = 0;
        while (true) {
            if (!(i < getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                tw20.p();
                return;
            }
            zaz zazVar = childAt instanceof zaz ? (zaz) childAt : null;
            if (zazVar != null) {
                zazVar.n(new v2y(iu30Var, (byte) 16));
            }
            i = i2;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        d7 d7Var = new d7(this, (byte) 8);
        while (d7Var.hasNext()) {
            ((View) d7Var.next()).setEnabled(enabled);
        }
    }

    public final void setViewContext(cbz cbzVar) {
        this.viewContext = cbzVar;
    }

    public EpisodeRowQuickActionSectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EpisodeRowQuickActionSectionView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ EpisodeRowQuickActionSectionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public EpisodeRowQuickActionSectionView(cbz cbzVar) {
        this(cbzVar.a, null, 0, 6, null);
        setViewContext(cbzVar);
    }
}
