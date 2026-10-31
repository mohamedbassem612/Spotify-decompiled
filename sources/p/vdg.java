package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkShadow;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vdg implements p4h1 {
    public final Button N0;
    public final Button O0;
    public final TextView X;
    public final TextView Y;
    public final ArtworkShadow Z;
    public final gw70 a;
    public final Context b;
    public final pd8 c;
    public final View d;
    public syf e;
    public final Drawable f;
    public final Drawable g;
    public final idd1 h;
    public final TextView i;
    public final ArtworkView t;

    public vdg(gw70 gw70Var, Context context, cir0 cir0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.a = gw70Var;
        this.b = context;
        pd8 pd8Var = new pd8(this);
        this.c = pd8Var;
        cir0Var.j(pd8Var);
        View viewInflate = layoutInflater.inflate(2131625371, viewGroup, false);
        this.d = viewInflate;
        this.f = f0o1.j(context, 2131233742);
        this.g = f0o1.j(context, 2131233741);
        this.h = new idd1(new lwe(this, (byte) 14));
        this.i = (TextView) viewInflate.findViewById(2131431356);
        ArtworkView artworkViewFindViewById = viewInflate.findViewById(2131427611);
        this.t = artworkViewFindViewById;
        this.X = (TextView) viewInflate.findViewById(2131431115);
        this.Y = (TextView) viewInflate.findViewById(2131430501);
        ArtworkShadow artworkShadowFindViewById = viewInflate.findViewById(2131427624);
        artworkShadowFindViewById.getClass();
        artworkShadowFindViewById.b(artworkViewFindViewById, false);
        this.Z = artworkShadowFindViewById;
        Button button = (Button) viewInflate.findViewById(2131427887);
        button.setOnClickListener(new udg(this, (byte) 0));
        this.N0 = button;
        Button button2 = (Button) viewInflate.findViewById(2131428179);
        button2.setOnClickListener(new udg(this, (byte) 1));
        this.O0 = button2;
    }

    public final View a() {
        return this.d;
    }
}
