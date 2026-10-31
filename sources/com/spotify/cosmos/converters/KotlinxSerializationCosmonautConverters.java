package com.spotify.cosmos.converters;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.cosmonaut.Converter;
import java.lang.reflect.Type;
import kotlin.Metadata;
import p.nfa0;
import p.nma0;
import p.nne;
import p.smo1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u000e\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/spotify/cosmos/converters/KotlinxSerializationCosmonautConverters;", "Lcom/spotify/cosmos/cosmonaut/Converter$Factory;", "Lp/nfa0;", "json", "<init>", "(Lp/nfa0;)V", "Ljava/lang/reflect/Type;", "type", "", "isKotlinxSerializationType", "(Ljava/lang/reflect/Type;)Z", "Lcom/spotify/cosmos/cosmonaut/Converter;", "", "createRequestConverter", "()Lcom/spotify/cosmos/cosmonaut/Converter;", "createResponseConverter", "Lp/nfa0;", "src_main_java_com_spotify_cosmos_converters-converters"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class KotlinxSerializationCosmonautConverters implements Converter.Factory {
    private final nfa0 json;

    public KotlinxSerializationCosmonautConverters(nfa0 nfa0Var) {
        this.json = nfa0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isKotlinxSerializationType(Type type) {
        try {
            smo1.D(this.json.b, type);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.spotify.cosmos.cosmonaut.Converter.Factory
    public Converter<?, byte[]> createRequestConverter() {
        return new Converter<Object, byte[]>() { // from class: com.spotify.cosmos.converters.KotlinxSerializationCosmonautConverters.createRequestConverter.1
            @Override // com.spotify.cosmos.cosmonaut.Converter
            public boolean canHandle(Type type) {
                return KotlinxSerializationCosmonautConverters.this.isKotlinxSerializationType(type);
            }

            @Override // com.spotify.cosmos.cosmonaut.Converter
            public byte[] convert(Type type, Object source) {
                if (source == null) {
                    return null;
                }
                return KotlinxSerializationCosmonautConverters.this.json.b(smo1.D(KotlinxSerializationCosmonautConverters.this.json.b, type), source).getBytes(nne.a);
            }
        };
    }

    @Override // com.spotify.cosmos.cosmonaut.Converter.Factory
    public Converter<byte[], ?> createResponseConverter() {
        return new Converter<byte[], Object>() { // from class: com.spotify.cosmos.converters.KotlinxSerializationCosmonautConverters.createResponseConverter.1
            @Override // com.spotify.cosmos.cosmonaut.Converter
            public boolean canHandle(Type type) {
                return KotlinxSerializationCosmonautConverters.this.isKotlinxSerializationType(type);
            }

            @Override // com.spotify.cosmos.cosmonaut.Converter
            public Object convert(Type type, byte[] source) {
                if (source == null || source.length == 0) {
                    return null;
                }
                nma0 nma0VarD = smo1.D(KotlinxSerializationCosmonautConverters.this.json.b, type);
                return KotlinxSerializationCosmonautConverters.this.json.a(new String(source, nne.a), nma0VarD);
            }
        };
    }
}
