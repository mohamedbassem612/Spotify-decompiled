package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x8g {
    public static final se11 b = new se11("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");
    public final h550 a;

    public x8g(h550 h550Var) {
        this.a = h550Var;
    }

    public static Intent a(Context context, v5g v5gVar) {
        Intent intent = new Intent(context, (Class<?>) ChoiceScreenUcActivity.class);
        intent.putExtra("EXTRA_CHOICE_SCREEN_UC_ARGS", (Parcelable) v5gVar);
        return intent;
    }

    public final v5g b(zxf zxfVar, Uri uri) {
        String lastPathSegment;
        if (c(uri) && (lastPathSegment = uri.getLastPathSegment()) != null) {
            return new v5g(zxfVar, lastPathSegment, uri.toString());
        }
        return null;
    }

    public final boolean c(Uri uri) {
        h550 h550Var = this.a;
        if (h550Var.a.b() && h550Var.a.d() && u890.j(uri.getScheme(), m3i1.b) && u890.j(uri.getHost(), "payments.spotify.com") && uri.getPathSegments().size() == 2 && u890.j(uri.getPathSegments().get(0), "checkout") && !u890.j(uri.getQueryParameter("skip"), "spotify")) {
            if (b.e(uri.getPathSegments().get(1))) {
                return true;
            }
        }
        return false;
    }
}
