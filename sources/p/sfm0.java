package p;

import androidx.car.app.model.CarColor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sfm0 {
    public final int a;
    public final int b;

    public sfm0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final CarColor a() {
        return CarColor.createCustom(this.a, this.b);
    }

    public final mmr0 b() {
        return new mmr0(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfm0)) {
            return false;
        }
        sfm0 sfm0Var = (sfm0) obj;
        return this.a == sfm0Var.a && this.b == sfm0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
