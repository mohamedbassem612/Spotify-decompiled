package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tja0 {
    public final /* synthetic */ byte a;

    static {
        int i = vz00.b;
    }

    public /* synthetic */ tja0(byte b) {
        this.a = b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException */
    public final t8 a(ByteArrayInputStream byteArrayInputStream, vz00 vz00Var) throws InvalidProtocolBufferException {
        t8 t8Var;
        try {
            int i = byteArrayInputStream.read();
            if (i == -1) {
                t8Var = null;
            } else {
                if ((i & 128) != 0) {
                    i &= 127;
                    int i2 = 7;
                    while (true) {
                        if (i2 < 32) {
                            int i3 = byteArrayInputStream.read();
                            if (i3 == -1) {
                                throw InvalidProtocolBufferException.a();
                            }
                            i |= (i3 & 127) << i2;
                            if ((i3 & 128) == 0) {
                                break;
                            }
                            i2 += 7;
                        } else {
                            while (true) {
                                if (i2 >= 64) {
                                    throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
                                }
                                int i4 = byteArrayInputStream.read();
                                if (i4 == -1) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                if ((i4 & 128) == 0) {
                                    break;
                                }
                                i2 += 7;
                            }
                        }
                    }
                }
                mwg mwgVar = new mwg(new q8(byteArrayInputStream, i, (byte) 0));
                t8Var = (t8) b(mwgVar, vz00Var);
                try {
                    mwgVar.a(0);
                } catch (InvalidProtocolBufferException e) {
                    e.a = t8Var;
                    throw e;
                }
            }
            if (t8Var == null || t8Var.isInitialized()) {
                return t8Var;
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            invalidProtocolBufferException.a = t8Var;
            throw invalidProtocolBufferException;
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        }
    }

    public final Object b(mwg mwgVar, vz00 vz00Var) {
        switch (this.a) {
            case 0:
                return new vja0(mwgVar);
            case 1:
                return new wja0(mwgVar);
            case 2:
                return new yja0(mwgVar, vz00Var);
            case 3:
                return new dka0(mwgVar, vz00Var);
            case 4:
                return new cka0(mwgVar);
            case 5:
                return new efy0(mwgVar, vz00Var);
            case 6:
                return new cfy0(mwgVar, vz00Var);
            case 7:
                return new bfy0(mwgVar, vz00Var);
            case 8:
                return new hfy0(mwgVar, vz00Var);
            case 9:
                return new ify0(mwgVar);
            case 10:
                return new kfy0(mwgVar, vz00Var);
            case 11:
                return new mfy0(mwgVar, vz00Var);
            case 12:
                return new rfy0(mwgVar, vz00Var);
            case 13:
                return new tfy0(mwgVar, vz00Var);
            case 14:
                return new wfy0(mwgVar, vz00Var);
            case 15:
                return new yfy0(mwgVar, vz00Var);
            case 16:
                return new cgy0(mwgVar, vz00Var);
            case 17:
                return new egy0(mwgVar, vz00Var);
            case 18:
                return new ggy0(mwgVar, vz00Var);
            case 19:
                return new kgy0(mwgVar, vz00Var);
            case 20:
                return new jgy0(mwgVar);
            case 21:
                return new mgy0(mwgVar);
            case 22:
                return new rgy0(mwgVar, vz00Var);
            case 23:
                return new pgy0(mwgVar, vz00Var);
            case 24:
                return new tgy0(mwgVar, vz00Var);
            case 25:
                return new wgy0(mwgVar, vz00Var);
            case 26:
                return new xgy0(mwgVar, vz00Var);
            case 27:
                return new zgy0(mwgVar, vz00Var);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new dhy0(mwgVar);
            default:
                return new ehy0(mwgVar, vz00Var);
        }
    }
}
