package com.spotify.cosmos.converters;

import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.cosmonaut.Converter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bf40;
import p.f4i1;
import p.l1d;
import p.qzr0;
import p.s2j0;
import p.zno1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0002\b\u00030\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/spotify/cosmos/converters/ProtoJavaliteConverters;", "Lcom/spotify/cosmos/cosmonaut/Converter$Factory;", "<init>", "()V", "createRequestConverter", "Lcom/spotify/cosmos/cosmonaut/Converter;", "", "createResponseConverter", "Companion", "src_main_java_com_spotify_cosmos_converters-converters"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class ProtoJavaliteConverters implements Converter.Factory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"Lcom/spotify/cosmos/converters/ProtoJavaliteConverters$Companion;", "", "<init>", "()V", "isProtobufModel", "", "typeArgument", "Ljava/lang/reflect/Type;", "src_main_java_com_spotify_cosmos_converters-converters"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isProtobufModel(Type typeArgument) {
            return (typeArgument instanceof Class) && s2j0.class.isAssignableFrom((Class) typeArgument);
        }

        private Companion() {
        }
    }

    @Override // com.spotify.cosmos.cosmonaut.Converter.Factory
    public Converter<?, byte[]> createRequestConverter() {
        return new Converter<Object, byte[]>() { // from class: com.spotify.cosmos.converters.ProtoJavaliteConverters.createRequestConverter.1
            @Override // com.spotify.cosmos.cosmonaut.Converter
            public boolean canHandle(Type type) {
                return ProtoJavaliteConverters.INSTANCE.isProtobufModel(type);
            }

            @Override // com.spotify.cosmos.cosmonaut.Converter
            public byte[] convert(Type type, Object source) {
                s2j0 s2j0Var = (s2j0) source;
                s2j0Var.getClass();
                return s2j0Var.toByteArray();
            }
        };
    }

    @Override // com.spotify.cosmos.cosmonaut.Converter.Factory
    public Converter<byte[], ?> createResponseConverter() {
        return new Converter<byte[], Object>() { // from class: com.spotify.cosmos.converters.ProtoJavaliteConverters.createResponseConverter.1
            @Override // com.spotify.cosmos.cosmonaut.Converter
            public boolean canHandle(Type type) {
                return ProtoJavaliteConverters.INSTANCE.isProtobufModel(type);
            }

            @Override // com.spotify.cosmos.cosmonaut.Converter
            public Object convert(Type type, byte[] source) throws IOException {
                String strConcat;
                Class cls = (Class) type;
                try {
                    return ((bf40) ((qzr0) cls.getDeclaredMethod("parser", null).invoke(null, null))).c(source);
                } catch (InvalidProtocolBufferException e) {
                    if (source == null) {
                        strConcat = "Body is missing when parsing ".concat(cls.getName());
                    } else if (source.length == 0) {
                        strConcat = "Body is empty when parsing ".concat(cls.getName());
                    } else {
                        String name = cls.getName();
                        int length = source.length;
                        String strZ = zno1.z(source);
                        StringBuilder sbS = l1d.s(length, "Invalid body when parsing ", name, ", length=", ", source=");
                        sbS.append(strZ);
                        strConcat = sbS.toString();
                    }
                    throw new IOException(strConcat, e);
                } catch (IllegalAccessException e2) {
                    throw new IOException(f4i1.f("failed to access ", cls.getName(), "#parser"), e2);
                } catch (NoSuchMethodException e3) {
                    throw new IOException(f4i1.f("failed to find method ", cls.getName(), "#parser"), e3);
                } catch (InvocationTargetException e4) {
                    throw new IOException(f4i1.f("failed to invoke method ", cls.getName(), "#parser"), e4);
                }
            }
        };
    }
}
