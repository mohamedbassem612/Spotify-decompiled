package p;

import com.spotify.appauthorization.builtinauth.model.FieldValidator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ds5 {
    public static es5 a(FieldValidator.ValidationException validationException) {
        String message = validationException.getMessage();
        if (message == null) {
            message = "";
        }
        return new es5(message);
    }

    public final nma0 serializer() {
        return cs5.a;
    }
}
