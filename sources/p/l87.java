package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class l87 extends tv30 implements iu30 {
    public static final l87 a = new l87(1, m87.class, "toAssistedCurationSavedState", "toAssistedCurationSavedState(Lcom/spotify/assistedcuration/page/domain/model/AssistedCurationModel;)Landroid/os/Bundle;", 1);

    public final Object invoke(Object obj) {
        rb7 rb7Var = (rb7) obj;
        Bundle bundle = new Bundle();
        bundle.putString("assisted_curation_selected_card_id", rb7Var.c);
        bundle.putParcelable("assisted_curation_mode", rb7Var.a);
        return bundle;
    }
}
