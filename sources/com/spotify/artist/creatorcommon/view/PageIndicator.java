package com.spotify.artist.creatorcommon.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import kotlin.Metadata;
import p.pdk1;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/spotify/artist/creatorcommon/view/PageIndicator;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lp/pdk1;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/viewpager/widget/ViewPager;", "viewPager", "Lp/rih1;", "setViewPager", "(Landroidx/viewpager/widget/ViewPager;)V", "src_main_java_com_spotify_artist_creatorcommon-creatorcommon"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PageIndicator extends AppCompatTextView implements pdk1 {
    public ViewPager i;

    /* JADX WARN: Multi-variable type inference failed */
    public PageIndicator(Context context) {
        super(context);
        setTextColor(getContext().getColor(2131101506));
    }

    @Override // p.pdk1
    public final void e(int i) {
        w();
        throw null;
    }

    public final void setViewPager(ViewPager viewPager) {
        this.i = viewPager;
        ArrayList arrayList = viewPager.g1;
        if (arrayList == null) {
            arrayList = new ArrayList();
            viewPager.g1 = arrayList;
        }
        arrayList.add(this);
        w();
        throw null;
    }

    public final void w() {
        ViewPager viewPager = this.i;
        if (viewPager != null) {
            viewPager.getAdapter();
            throw new IllegalStateException("Required value was null.");
        }
        u890.C("viewPager");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTextColor(getContext().getColor(2131101506));
    }

    @Override // p.pdk1
    public final void c(float f, int i) {
    }
}
