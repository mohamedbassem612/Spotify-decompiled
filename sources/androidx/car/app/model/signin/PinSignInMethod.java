package androidx.car.app.model.signin;

import androidx.car.app.model.CarText;
import java.util.Objects;
import p.hhg1;
import p.qrd;
import p.rj81;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class PinSignInMethod implements rj81 {
    private static final int MAX_PIN_LENGTH = 12;
    private final CarText mPinCode;

    public PinSignInMethod(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        int length = charSequence.length();
        if (length == 0) {
            hhg1.n("PIN must not be empty");
            throw null;
        }
        if (length <= 12) {
            this.mPinCode = CarText.create(charSequence);
        } else {
            hhg1.n("PIN must not be longer than 12 characters");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PinSignInMethod) {
            return Objects.equals(this.mPinCode, ((PinSignInMethod) obj).mPinCode);
        }
        return false;
    }

    public CarText getPinCode() {
        CarText carText = this.mPinCode;
        Objects.requireNonNull(carText);
        return carText;
    }

    public int hashCode() {
        return Objects.hash(this.mPinCode);
    }

    private PinSignInMethod() {
        this.mPinCode = null;
    }
}
