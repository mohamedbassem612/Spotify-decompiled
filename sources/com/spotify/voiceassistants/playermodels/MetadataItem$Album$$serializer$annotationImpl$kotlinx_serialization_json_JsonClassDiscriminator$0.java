package com.spotify.voiceassistants.playermodels;

import kotlin.Metadata;
import p.f4i1;
import p.u890;
import p.ufa0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class MetadataItem$Album$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0 implements ufa0 {
    private final /* synthetic */ String discriminator;

    public MetadataItem$Album$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0(String str) {
        this.discriminator = str;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return ufa0.class;
    }

    @Override // p.ufa0
    public final /* synthetic */ String discriminator() {
        return this.discriminator;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return (obj instanceof ufa0) && u890.j(discriminator(), ((ufa0) obj).discriminator());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return this.discriminator.hashCode() ^ 707790692;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return f4i1.f("@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=", this.discriminator, ")");
    }
}
