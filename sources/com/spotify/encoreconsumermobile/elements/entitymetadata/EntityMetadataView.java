package com.spotify.encoreconsumermobile.elements.entitymetadata;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.badge.badgegroup.BadgeGroupView;
import com.spotify.encoreconsumermobile.elements.metadatarow.MetadataRow;
import com.spotify.encoreconsumermobile.elements.playprogressbar.PlayProgressBarView;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.b2a;
import p.b8k1;
import p.idd1;
import p.ihc1;
import p.mo2;
import p.nmy;
import p.o7h;
import p.oqt0;
import p.p7h;
import p.plm;
import p.tlv;
import p.u890;
import p.xfo1;
import p.yc21;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@adt
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/entitymetadata/EntityMetadataView;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/spotify/encoreconsumermobile/elements/badge/badgegroup/BadgeGroupView;", "b", "Lp/znb0;", "getBadgeGroupView", "()Lcom/spotify/encoreconsumermobile/elements/badge/badgegroup/BadgeGroupView;", "badgeGroupView", "Lcom/spotify/encoreconsumermobile/elements/playprogressbar/PlayProgressBarView;", "c", "getPlayProgressBarView", "()Lcom/spotify/encoreconsumermobile/elements/playprogressbar/PlayProgressBarView;", "playProgressBarView", "src_main_java_com_spotify_encoreconsumermobile_elements_entitymetadata-entitymetadata"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EntityMetadataView extends FrameLayout implements tlv {
    public final MetadataRow a;
    public final idd1 b;
    public final idd1 c;
    public final ArrayList d;
    public final int e;
    public yc21 f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, androidx.constraintlayout.widget.ConstraintLayout, com.spotify.encoreconsumermobile.elements.metadatarow.MetadataRow] */
    public EntityMetadataView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ?? metadataRow = new MetadataRow(context, null, 0, 6, null);
        metadataRow.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        WeakHashMap weakHashMap = b8k1.a;
        metadataRow.setId(View.generateViewId());
        addView(metadataRow);
        this.a = metadataRow;
        this.b = new idd1(new mo2(context, (byte) 17));
        this.c = new idd1(new mo2(context, (byte) 18));
        this.d = new ArrayList();
        this.e = xfo1.r(this, 2130970418);
    }

    private final BadgeGroupView getBadgeGroupView() {
        return (BadgeGroupView) this.b.getValue();
    }

    private final PlayProgressBarView getPlayProgressBarView() {
        return (PlayProgressBarView) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View, com.spotify.encoreconsumermobile.elements.playprogressbar.PlayProgressBarView] */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void f(nmy nmyVar) throws Throwable {
        b2a b2aVar = nmyVar.a;
        z6x z6xVar = nmyVar.b;
        if (z6xVar == null) {
            z6xVar = z6x.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) z6xVar) {
            if (!ihc1.y0((String) obj)) {
                arrayList.add(obj);
            }
        }
        oqt0 oqt0Var = nmyVar.c;
        boolean z = nmyVar.d;
        yc21 yc21Var = new yc21(b2aVar, arrayList, oqt0Var, z);
        yc21 yc21Var2 = this.f;
        if (yc21Var.equals(yc21Var2)) {
            return;
        }
        Throwable th = null;
        boolean zJ = u890.j(yc21Var2 != null ? yc21Var2.e : null, yc21Var.e);
        ArrayList arrayList2 = this.d;
        int i = 0;
        if (zJ) {
            if (!u890.j(yc21Var2.a, b2aVar) && b2aVar != null) {
                getBadgeGroupView().z(b2aVar);
            }
            for (Object obj2 : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                String str = (String) obj2;
                if (!u890.j(str, yc21Var2.b.get(i))) {
                    ((EncoreTextView) arrayList2.get(i)).setText(str);
                }
                i = i2;
            }
            if (!u890.j(yc21Var2.c, oqt0Var) && oqt0Var != null) {
                getPlayProgressBarView().W0.a(oqt0Var);
            }
            if (yc21Var2.d != z) {
                setAlpha(z ? 0.3f : 1.0f);
            }
        } else {
            MetadataRow metadataRow = this.a;
            metadataRow.A();
            int separatorColor = metadataRow.getSeparatorColor();
            int i3 = this.e;
            if (separatorColor != i3) {
                metadataRow.setSeparatorColor(i3);
            }
            if (b2aVar != null) {
                getBadgeGroupView().z(b2aVar);
                MetadataRow.y(metadataRow, getBadgeGroupView(), false);
            }
            int i4 = 0;
            for (Object obj3 : arrayList) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    Throwable th2 = th;
                    p7h.T();
                    throw th2;
                }
                String str2 = (String) obj3;
                TextView textView = (EncoreTextView) o7h.t0(i4, arrayList2);
                if (textView == null) {
                    TextView encoreTextView = new EncoreTextView(new plm(getContext(), 2132017749), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    encoreTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    WeakHashMap weakHashMap = b8k1.a;
                    encoreTextView.setId(View.generateViewId());
                    arrayList2.add(i4, encoreTextView);
                    textView = encoreTextView;
                }
                textView.setTextColor(xfo1.r(textView, 2130970418));
                if (!u890.j(textView.getText(), str2)) {
                    textView.setText(str2);
                }
                MetadataRow.y(metadataRow, textView, i4 != 0);
                th = th;
                i4 = i5;
            }
            oqt0 oqt0Var2 = yc21Var.c;
            if (oqt0Var2 != null) {
                ?? playProgressBarView = getPlayProgressBarView();
                playProgressBarView.W0.a(oqt0Var2);
                playProgressBarView.setVisibility(0);
                MetadataRow.y(metadataRow, playProgressBarView, yc21Var.a());
            }
            setAlpha(z ? 0.3f : 1.0f);
        }
        this.f = yc21Var;
    }

    public EntityMetadataView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EntityMetadataView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ EntityMetadataView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
