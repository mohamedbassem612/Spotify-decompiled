package p;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp/s5w0;", "Lp/zf30;", "<init>", "()V", "src_main_java_com_spotify_tome_dialog-dialog"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public abstract class s5w0 extends zf30 {
    public h3u F1;
    public int G1 = -1;

    public void F0(Bundle bundle) {
        String str;
        h3u h3uVar = this.F1;
        if (h3uVar != null && (str = ((zf30) h3uVar).a1) != null) {
            bundle.putString("presenter_tag", str);
        }
        bundle.putInt("request_code", this.G1);
    }

    public void Y0() {
        n57.c(-1, Integer.valueOf(this.G1));
    }

    public void u0(int i, int i2, Intent intent) {
        n57.c(-1, Integer.valueOf(i));
        super.u0(i, i2, intent);
        h3u h3uVar = this.F1;
        if (h3uVar != null) {
            h3uVar.u0(i, i2, intent);
        }
    }

    public void w0(Bundle bundle) {
        super.w0(bundle);
        if (bundle != null) {
            bundle.setClassLoader(P0().getClassLoader());
            String string = bundle.getString("presenter_tag");
            this.F1 = string != null ? (h3u) j0().G(string) : null;
            this.G1 = bundle.getInt("request_code");
        }
    }
}
