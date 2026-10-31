package p;

import android.text.TextUtils;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ty {
    public final boolean a;
    public CarText b;
    public CarIcon c;
    public e2q0 d;
    public CarColor e;
    public final int f;
    public int g;

    public ty(Action action) {
        this.a = true;
        CarColor carColor = CarColor.DEFAULT;
        this.e = carColor;
        this.f = 1;
        this.g = 0;
        Objects.requireNonNull(action);
        this.f = action.getType();
        this.c = action.getIcon();
        this.b = action.getTitle();
        this.d = action.getOnClickDelegate();
        CarColor backgroundColor = action.getBackgroundColor();
        this.e = backgroundColor != null ? backgroundColor : carColor;
        this.g = action.getFlags();
        this.a = action.isEnabled();
    }

    public final Action a() {
        CarText carText;
        CarText carText2;
        CarText carText3;
        int i = this.f;
        if (!Action.isStandardActionType(i) && this.c == null && ((carText3 = this.b) == null || TextUtils.isEmpty(carText3.toString()))) {
            eg.m("An action must have either an icon or a title");
            return null;
        }
        if (i == 65538 || i == 65539) {
            if (this.d != null) {
                eg.m(f4i1.c(i, "An on-click listener can't be set on an action of type "));
                return null;
            }
            if (this.c != null || ((carText = this.b) != null && !TextUtils.isEmpty(carText.toString()))) {
                eg.m("An icon or title can't be set on the standard back or app-icon action");
                return null;
            }
        }
        if (i == 65540 && this.d != null) {
            eg.m("An on-click listener can't be set on the pan mode action");
            return null;
        }
        if (i == 65541) {
            if (this.d != null) {
                eg.m("An on-click listener can't be set on the compose action");
                return null;
            }
            CarText carText4 = this.b;
            if (carText4 != null && !TextUtils.isEmpty(carText4.toString())) {
                eg.m("A title can't be set on the standard compose action");
                return null;
            }
        }
        if (i != 65542 || (this.c == null && ((carText2 = this.b) == null || TextUtils.isEmpty(carText2.toString())))) {
            return new Action(this);
        }
        eg.m("MEDIA_PLAYBACK actions cannot have icons or titles");
        return null;
    }

    public ty() {
        this.a = true;
        this.e = CarColor.DEFAULT;
        this.f = 1;
        this.g = 0;
    }
}
