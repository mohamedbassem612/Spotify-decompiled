package com.spotify.mainlayout.ui.view.gradient;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.messages.BetamaxPlaybackSession;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import p.ceo;
import p.coz0;
import p.dlv;
import p.een0;
import p.lr80;
import p.mlv;
import p.mma0;
import p.o7h;
import p.q7h;
import p.qzf0;
import p.sgp0;
import p.sr80;
import p.tr80;
import p.uah;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R/\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR/\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR/\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\t\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/spotify/mainlayout/ui/view/gradient/MainLayoutGradientView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "<set-?>", "a", "Ljava/lang/Object;", "getTopColor", "()Ljava/lang/Integer;", "setTopColor", "(Ljava/lang/Integer;)V", "topColor", "b", "getBottomColor", "setBottomColor", "bottomColor", "Lp/dlv;", "c", "getEasing", "()Lp/dlv;", "setEasing", "(Lp/dlv;)V", "easing", "src_main_java_com_spotify_mainlayout_ui_view-view"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class MainLayoutGradientView extends View {
    public static final /* synthetic */ mma0[] d = {new een0(MainLayoutGradientView.class, "topColor", "getTopColor()Ljava/lang/Integer;", 0), new een0(MainLayoutGradientView.class, "bottomColor", "getBottomColor()Ljava/lang/Integer;", 0), new een0(MainLayoutGradientView.class, "easing", "getEasing()Landroidx/compose/animation/core/Easing;", 0)};
    public final qzf0 a;
    public final qzf0 b;
    public final qzf0 c;

    public MainLayoutGradientView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new qzf0(this, (byte) 0);
        this.b = new qzf0(this, (byte) 1);
        this.c = new qzf0(this, (byte) 2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, coz0.e, 0, 0);
        setTopColor(Integer.valueOf(typedArrayObtainStyledAttributes.getColor(2, 0)));
        setBottomColor(Integer.valueOf(typedArrayObtainStyledAttributes.getColor(0, 0)));
        int i = typedArrayObtainStyledAttributes.getInt(1, -1);
        setEasing(i != 0 ? i != 1 ? mlv.d : new ceo(0.51f, 0.0f, 0.26f, 1.0f) : mlv.c);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a() {
        Integer topColor = getTopColor();
        if (topColor != null) {
            int iIntValue = topColor.intValue();
            Integer bottomColor = getBottomColor();
            if (bottomColor != null) {
                int iIntValue2 = bottomColor.intValue();
                dlv easing = getEasing();
                if (easing == null) {
                    return;
                }
                tr80 tr80Var = new tr80(0, 20, 1);
                ArrayList arrayList = new ArrayList(q7h.U(tr80Var, 10));
                lr80 it = tr80Var.iterator();
                while (((sr80) it).c) {
                    arrayList.add(Float.valueOf(easing.a(it.nextInt() / 20.0f)));
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(uah.d(iIntValue, iIntValue2, ((Number) it2.next()).floatValue())));
                }
                setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, o7h.k1(arrayList2)));
            }
        }
    }

    public final Integer getBottomColor() {
        mma0 mma0Var = d[1];
        return (Integer) ((sgp0) this.b).a;
    }

    public final dlv getEasing() {
        mma0 mma0Var = d[2];
        return (dlv) ((sgp0) this.c).a;
    }

    public final Integer getTopColor() {
        mma0 mma0Var = d[0];
        return (Integer) ((sgp0) this.a).a;
    }

    public final void setBottomColor(Integer num) {
        this.b.c(d[1], this, num);
    }

    public final void setEasing(dlv dlvVar) {
        this.c.c(d[2], this, dlvVar);
    }

    public final void setTopColor(Integer num) {
        this.a.c(d[0], this, num);
    }
}
