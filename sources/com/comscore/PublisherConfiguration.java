package com.comscore;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class PublisherConfiguration extends ClientConfiguration {
    private PublisherUniqueDeviceIdListener d;

    private PublisherConfiguration(Builder builder, PublisherUniqueDeviceIdListener publisherUniqueDeviceIdListener) {
        super(builder);
        this.d = publisherUniqueDeviceIdListener;
        try {
            this.b = newCppInstanceNative(builder, publisherUniqueDeviceIdListener);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    private static native void destroyCppInstanceNative(long j, PublisherUniqueDeviceIdListener publisherUniqueDeviceIdListener);

    private static native String getPublisherIdNative(long j);

    private static native long newCppInstanceNative(Builder builder, PublisherUniqueDeviceIdListener publisherUniqueDeviceIdListener);

    @Override // com.comscore.util.cpp.CppJavaBinder
    public void destroyCppObject() {
        destroyCppInstanceNative(this.b, this.d);
    }

    public String getPublisherId() {
        try {
            return getPublisherIdNative(this.b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public static class Builder extends ClientConfiguration.Builder<Builder, PublisherConfiguration> {
        private PublisherUniqueDeviceIdListener a;

        public Builder() {
        }

        @Override // com.comscore.ClientConfiguration.Builder
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Builder a() {
            return new Builder(this);
        }

        @Override // com.comscore.ClientConfiguration.Builder
        public PublisherConfiguration build() {
            return new PublisherConfiguration(this, this.a, 0);
        }

        public Builder publisherId(String str) {
            setClientId(str);
            return this;
        }

        public Builder publisherUniqueDeviceIdListener(PublisherUniqueDeviceIdListener publisherUniqueDeviceIdListener) {
            this.a = publisherUniqueDeviceIdListener;
            return this;
        }

        private Builder(Builder builder) {
            super(builder);
        }

        @Override // com.comscore.ClientConfiguration.Builder
        public Builder self() {
            return this;
        }
    }

    public PublisherConfiguration(long j) {
        this.b = j;
    }

    public /* synthetic */ PublisherConfiguration(Builder builder, PublisherUniqueDeviceIdListener publisherUniqueDeviceIdListener, int i) {
        this(builder, publisherUniqueDeviceIdListener);
    }
}
