package com.comscore;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class PartnerConfiguration extends ClientConfiguration {
    private PartnerConfiguration(Builder builder) {
        super(builder);
        try {
            ((ClientConfiguration) this).b = newCppInstanceNative(builder);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    private static native void destroyCppInstanceNative(long j);

    private static native String getExternalClientIdNative(long j);

    private static native String getPartnerIdNative(long j);

    private static native long newCppInstanceNative(Builder builder);

    public void destroyCppObject() {
        destroyCppInstanceNative(((ClientConfiguration) this).b);
    }

    public String getExternalClientId() {
        try {
            return getExternalClientIdNative(((ClientConfiguration) this).b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public String getPartnerId() {
        try {
            return getPartnerIdNative(((ClientConfiguration) this).b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public static class Builder extends ClientConfiguration.Builder<Builder, PartnerConfiguration> {
        protected String externalClientId;

        private Builder(Builder builder) {
            super(builder);
            this.externalClientId = builder.externalClientId;
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Builder a() {
            return new Builder(this);
        }

        public PartnerConfiguration build() {
            return new PartnerConfiguration(this, 0);
        }

        public Builder externalClientId(String str) {
            this.externalClientId = str;
            return this;
        }

        public Builder partnerId(String str) {
            setClientId(str);
            return this;
        }

        public Builder self() {
            return this;
        }

        public Builder() {
        }
    }

    public PartnerConfiguration(long j) {
        ((ClientConfiguration) this).b = j;
    }

    public /* synthetic */ PartnerConfiguration(Builder builder, int i) {
        this(builder);
    }
}
