package androidx.car.app.model;

import java.util.Objects;
import p.nij0;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class Metadata {
    public static final Metadata EMPTY_METADATA = new Metadata(new nij0());
    private final Place mPlace;

    public Metadata(nij0 nij0Var) {
        nij0Var.getClass();
        this.mPlace = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Metadata) {
            return Objects.equals(this.mPlace, ((Metadata) obj).mPlace);
        }
        return false;
    }

    public Place getPlace() {
        return this.mPlace;
    }

    public int hashCode() {
        return Objects.hashCode(this.mPlace);
    }

    private Metadata() {
        this.mPlace = null;
    }
}
