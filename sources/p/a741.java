package p;

import android.content.Intent;
import android.os.Bundle;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a741 {
    public Intent a;

    public final Intent a(slc0 slc0Var) {
        Intent intent = new Intent(this.a);
        Bundle bundle = new Bundle();
        if (slc0Var == null) {
            slc0Var = new slc0(UUID.randomUUID().toString());
        }
        bundle.putParcelable("account_linking_id", slc0Var);
        intent.putExtra("account_linking_bundle", bundle);
        return intent;
    }
}
