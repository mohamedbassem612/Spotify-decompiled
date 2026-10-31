package com.spotify.artist.creatorcommon.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Metadata;
import p.dz70;
import p.gw70;
import p.hq70;
import p.ird1;
import p.ixg;
import p.jc10;
import p.p94;
import p.u890;
import p.vy70;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/spotify/artist/creatorcommon/view/ArtistBiographyImageView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "setImageView", "(Landroid/widget/ImageView;)V", "imageView", "src_main_java_com_spotify_artist_creatorcommon-creatorcommon"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ArtistBiographyImageView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ImageView imageView;

    public ArtistBiographyImageView(Context context) {
        super(context);
    }

    public final void a(hq70 hq70Var, gw70 gw70Var) {
        String str = hq70Var.a;
        if (str.length() <= 0) {
            str = null;
        }
        ixg ixgVarF = gw70Var.f(str);
        ixgVarF.l(2131233750);
        vy70 vy70Var = ixgVarF.b;
        jc10 jc10Var = dz70.a;
        vy70Var.m = new p94(2131233750, (byte) 6);
        ixgVarF.k(getImageView(), (ird1) null);
    }

    public final ImageView getImageView() {
        ImageView imageView = this.imageView;
        if (imageView != null) {
            return imageView;
        }
        u890.C("imageView");
        throw null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setImageView((ImageView) LayoutInflater.from(getContext()).inflate(2131624089, this).findViewById(2131429612));
    }

    public final void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public ArtistBiographyImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
