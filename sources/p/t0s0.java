package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.messages.BetamaxPlaybackSession;
import java.util.UUID;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp/t0s0;", "Lp/zf30;", "<init>", "()V", "src_main_java_com_spotify_partneraccountlinking_partneraccountlinking-partneraccountlinking"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class t0s0 extends zf30 {
    public tzr0 F1;
    public v0s0 G1;
    public slc0 H1;

    public final void v0(Context context) {
        nmn1.p(this);
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        slc0 slc0Var;
        Bundle bundle2 = ((zf30) this).f;
        if (bundle2 == null || (slc0Var = (slc0) bundle2.getParcelable("account_linking_id")) == null) {
            slc0Var = new slc0(UUID.randomUUID().toString());
        }
        this.H1 = slc0Var;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(2131625359, viewGroup, false);
        viewGroup2.findViewById(2131431524).setOnClickListener(new s0s0(this, (byte) 0));
        viewGroup2.findViewById(2131428491).setOnClickListener(new s0s0(this, (byte) 1));
        viewGroup2.findViewById(2131427673).setOnClickListener(new s0s0(this, (byte) 2));
        viewGroup2.findViewById(2131428491).setTextColor(tyd1.b);
        return viewGroup2;
    }
}
