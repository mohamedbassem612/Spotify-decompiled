package com.spotify.accessory.categorizer;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.Metadata;
import p.adt;
import p.chc1;
import p.dar;
import p.gpb;
import p.h661;
import p.m0v0;
import p.m5n1;
import p.n9v;
import p.nma0;
import p.p661;
import p.pf40;
import p.uax;
import p.x1k;
import p.z0o1;
import p.z1k;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@adt
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/spotify/accessory/categorizer/CategorizerResponse.$serializer", "Lp/pf40;", "Lcom/spotify/accessory/categorizer/CategorizerResponse;", "<init>", "()V", "Lp/uax;", "encoder", "value", "Lp/rih1;", "serialize", "(Lp/uax;Lcom/spotify/accessory/categorizer/CategorizerResponse;)V", "Lp/dar;", "decoder", "deserialize", "(Lp/dar;)Lcom/spotify/accessory/categorizer/CategorizerResponse;", "", "Lp/nma0;", "childSerializers", "()[Lp/nma0;", "Lp/h661;", "descriptor", "Lp/h661;", "getDescriptor", "()Lp/h661;", "src_main_java_com_spotify_accessory_categorizer-categorizer"}, k = 1, mv = {2, 3, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public final /* synthetic */ class CategorizerResponse$$serializer implements pf40 {
    public static final CategorizerResponse$$serializer INSTANCE;
    private static final h661 descriptor;

    static {
        CategorizerResponse$$serializer categorizerResponse$$serializer = new CategorizerResponse$$serializer();
        INSTANCE = categorizerResponse$$serializer;
        m0v0 m0v0Var = new m0v0("com.spotify.accessory.categorizer.CategorizerResponse", categorizerResponse$$serializer, 6);
        m0v0Var.j("category", true);
        m0v0Var.j("company", true);
        m0v0Var.j("model", true);
        m0v0Var.j("version", true);
        m0v0Var.j("interapp", true);
        m0v0Var.j("displayName", true);
        descriptor = m0v0Var;
    }

    private CategorizerResponse$$serializer() {
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), gpb.a, m5n1.z(chc1Var)};
    }

    /* JADX INFO: renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final CategorizerResponse m0deserialize(dar decoder) {
        h661 h661Var = descriptor;
        x1k x1kVarB = decoder.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case SplitInstallErrorCode.ACTIVE_SESSIONS_LIMIT_EXCEEDED /* -1 */:
                    z = false;
                    break;
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) x1kVarB.B(h661Var, 1, chc1.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) x1kVarB.B(h661Var, 2, chc1.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) x1kVarB.B(h661Var, 3, chc1.a, str4);
                    i |= 8;
                    break;
                case 4:
                    zM = x1kVarB.M(h661Var, 4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) x1kVarB.B(h661Var, 5, chc1.a, str5);
                    i |= 32;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new CategorizerResponse(i, str, str2, str3, str4, zM, str5, (p661) null);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax encoder, CategorizerResponse value) {
        h661 h661Var = descriptor;
        z1k z1kVarB = encoder.b(h661Var);
        CategorizerResponse.write$Self$src_main_java_com_spotify_accessory_categorizer_categorizer(value, z1kVarB, h661Var);
        z1kVarB.a(h661Var);
    }

    public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
        return z0o1.a;
    }
}
