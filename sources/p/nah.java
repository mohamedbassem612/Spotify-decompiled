package p;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nah implements f080 {
    public final ArtworkView a;
    public ird1 b;

    public nah(ArtworkView artworkView) {
        this.a = artworkView;
    }

    public final void e(int i, Bitmap bitmap) {
        Drawable bitmapDrawable;
        if (bitmap.isRecycled()) {
            bhn0.w();
            return;
        }
        ArtworkView artworkView = this.a;
        Drawable drawable = artworkView.getDrawable();
        AnimationDrawable animationDrawable = drawable instanceof AnimationDrawable ? (AnimationDrawable) drawable : null;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
        if (i != 1) {
            Drawable drawable2 = artworkView.getDrawable();
            if (drawable2 == null) {
                drawable2 = new ColorDrawable(0);
            }
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, new BitmapDrawable(artworkView.getResources(), bitmap)});
            transitionDrawable.setCrossFadeEnabled(true);
            transitionDrawable.startTransition(200);
            bitmapDrawable = transitionDrawable;
        } else {
            bitmapDrawable = new BitmapDrawable(artworkView.getResources(), bitmap);
        }
        artworkView.setImageDrawable(bitmapDrawable);
        ird1 ird1Var = this.b;
        if (ird1Var != null) {
            ird1Var.onSuccess();
        }
        ird1 ird1Var2 = this.b;
        f8h f8hVar = ird1Var2 instanceof f8h ? (f8h) ird1Var2 : null;
        if (f8hVar == null) {
            return;
        }
        new tfp0(bitmap).b(new y1t0(new dg8(f8hVar, (byte) 25), (byte) 9));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof nah) && ((nah) obj).a == this.a;
    }

    public final void g(Drawable drawable) {
        ArtworkView artworkView = this.a;
        artworkView.setImageDrawable(drawable);
        Drawable drawable2 = artworkView.getDrawable();
        AnimationDrawable animationDrawable = drawable2 instanceof AnimationDrawable ? (AnimationDrawable) drawable2 : null;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void m(Drawable drawable) {
        ArtworkView artworkView = this.a;
        Object drawable2 = artworkView.getDrawable();
        Animatable animatable = drawable2 instanceof Animatable ? (Animatable) drawable2 : null;
        if (animatable != null) {
            animatable.stop();
        }
        if (drawable != null) {
            artworkView.setImageDrawable(drawable);
        }
        ird1 ird1Var = this.b;
        if (ird1Var != null) {
            ird1Var.o((Exception) null);
        }
        f8h f8hVar = this.b;
        f8h f8hVar2 = f8hVar instanceof f8h ? f8hVar : null;
        if (f8hVar2 != null) {
            ((h47) f8hVar2).b.invoke(new b07((Integer) null));
        }
    }
}
