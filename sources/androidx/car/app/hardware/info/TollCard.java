package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;
import p.f1f1;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class TollCard {
    public static final int TOLLCARD_STATE_INVALID = 2;
    public static final int TOLLCARD_STATE_NOT_INSERTED = 3;
    public static final int TOLLCARD_STATE_UNKNOWN = 0;
    public static final int TOLLCARD_STATE_VALID = 1;
    private final CarValue<Integer> mCardState;

    public TollCard(f1f1 f1f1Var) {
        CarValue<Integer> carValue = f1f1Var.a;
        Objects.requireNonNull(carValue);
        this.mCardState = carValue;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TollCard) {
            return Objects.equals(this.mCardState, ((TollCard) obj).mCardState);
        }
        return false;
    }

    public CarValue<Integer> getCardState() {
        CarValue<Integer> carValue = this.mCardState;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(this.mCardState);
    }

    public String toString() {
        return "[ tollcard state: " + this.mCardState + "]";
    }

    private TollCard() {
        this.mCardState = CarValue.UNKNOWN_INTEGER;
    }
}
