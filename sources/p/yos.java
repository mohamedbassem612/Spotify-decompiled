package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class yos implements ufa0 {
    public final /* synthetic */ Class annotationType() {
        return ufa0.class;
    }

    public final /* synthetic */ String discriminator() {
        return "filter";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ufa0) && "filter".equals(((ufa0) obj).discriminator());
    }

    public final int hashCode() {
        return -1640444900;
    }

    public final String toString() {
        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=filter)";
    }
}
