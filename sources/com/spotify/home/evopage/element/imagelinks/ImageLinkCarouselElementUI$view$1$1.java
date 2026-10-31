package com.spotify.home.evopage.element.imagelinks;

import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.Map;
import kotlin.Metadata;
import p.dv70;
import p.n611;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/spotify/home/evopage/element/imagelinks/ImageLinkCarouselElementUI$view$1$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "src_main_java_com_spotify_home_evopage_element_imagelinks-imagelinks"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class ImageLinkCarouselElementUI$view$1$1 extends LinearLayoutManager {
    public final /* synthetic */ dv70 g1;
    public final /* synthetic */ Map h1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLinkCarouselElementUI$view$1$1(dv70 dv70Var, Map map) {
        super(0);
        this.g1 = dv70Var;
        this.h1 = map;
        ((LinearLayoutManager) this).e1 = (byte) 4;
        ((LinearLayoutManager) this).a1 = true;
    }

    public final void g0(RecyclerView recyclerView) {
        Parcelable parcelable;
        String strB = this.g1.b();
        if (strB == null || (parcelable = (Parcelable) this.h1.get(strB)) == null) {
            return;
        }
        w0(parcelable);
    }

    public final void h0(RecyclerView recyclerView, n611 n611Var) {
        String strB = this.g1.b();
        if (strB != null) {
            this.h1.put(strB, x0());
        }
        super.h0(recyclerView, n611Var);
    }
}
