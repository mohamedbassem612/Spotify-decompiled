package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.LinkedHashMap;
import java.util.List;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pv30 implements nv30 {
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public List R0;
    public fg5 S0;
    public boolean T0;
    public final LinkedHashMap U0;
    public Boolean V0;
    public boolean W0;
    public a8b0 X;
    public final /* synthetic */ qv30 X0;
    public ajn0 Y;
    public boolean Z;
    public j1h1 a;
    public n9r b;
    public int c;
    public lht d;
    public ov30 e;
    public int f;
    public List g;
    public final List h;
    public rob0 i;
    public rob0 t;

    public pv30(qv30 qv30Var, j1h1 j1h1Var, n9r n9rVar, int i, lht lhtVar, int i2, List list, List list2, rob0 rob0Var, a8b0 a8b0Var) {
        if (j1h1Var == null) {
            b(0);
            throw null;
        }
        if (n9rVar == null) {
            b(1);
            throw null;
        }
        if (i == 0) {
            b(2);
            throw null;
        }
        if (lhtVar == null) {
            b(3);
            throw null;
        }
        if (i2 == 0) {
            b(4);
            throw null;
        }
        if (list == null) {
            b(5);
            throw null;
        }
        if (list2 == null) {
            b(6);
            throw null;
        }
        if (a8b0Var == null) {
            b(7);
            throw null;
        }
        this.X0 = qv30Var;
        this.e = null;
        this.t = qv30Var.X;
        this.Z = true;
        this.N0 = false;
        this.O0 = false;
        this.P0 = false;
        this.Q0 = qv30Var.T0;
        this.R0 = null;
        this.S0 = null;
        this.T0 = qv30Var.U0;
        this.U0 = new LinkedHashMap();
        this.V0 = null;
        this.W0 = false;
        this.a = j1h1Var;
        this.b = n9rVar;
        this.c = i;
        this.d = lhtVar;
        this.f = i2;
        this.g = list;
        this.h = list2;
        this.i = rob0Var;
        this.X = a8b0Var;
        this.Y = null;
    }

    public static /* synthetic */ void b(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
            case 29:
            case 30:
            case 31:
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
            case 33:
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
            case 36:
            case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
            case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
            case 29:
            case 30:
            case 31:
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
            case 33:
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
            case 36:
            case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
            case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                i2 = 2;
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case 14:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case 6:
                objArr[0] = "newContextReceiverParameters";
                break;
            case 7:
                objArr[0] = "newReturnType";
                break;
            case 8:
                objArr[0] = "owner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
            case 29:
            case 30:
            case 31:
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
            case 33:
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
            case 36:
            case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
            case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 10:
                objArr[0] = "modality";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 17:
                objArr[0] = "name";
                break;
            case 19:
            case 21:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = "type";
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case 35:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case 13:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case 16:
                objArr[1] = "setCopyOverrides";
                break;
            case 18:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case 26:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case 29:
                objArr[1] = "setOriginal";
                break;
            case 30:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case 36:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
                objArr[1] = "setSubstitution";
                break;
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
                objArr[1] = "putUserData";
                break;
            case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
                objArr[1] = "getSubstitution";
                break;
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i) {
            case 8:
                objArr[2] = "setOwner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
            case 29:
            case 30:
            case 31:
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
            case 33:
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
            case 36:
            case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
            case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                break;
            case 10:
                objArr[2] = "setModality";
                break;
            case 12:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case 19:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case 35:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
            case 29:
            case 30:
            case 31:
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
            case 33:
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
            case 36:
            case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
            case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                throw new IllegalStateException(str2);
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public final nv30 A() {
        this.U0.put(c8a0.h1, Boolean.TRUE);
        return this;
    }

    public final nv30 E(rob0 rob0Var) {
        this.t = rob0Var;
        return this;
    }

    public final nv30 H() {
        this.N0 = true;
        return this;
    }

    public final nv30 a(List list) {
        this.g = list;
        return this;
    }

    public final ov30 build() {
        return this.X0.z1(this);
    }

    public final nv30 c(int i) {
        if (i != 0) {
            this.f = i;
            return this;
        }
        b(14);
        throw null;
    }

    public final nv30 d(ajn0 ajn0Var) {
        this.Y = ajn0Var;
        return this;
    }

    public final nv30 f() {
        this.T0 = true;
        return this;
    }

    public final nv30 g(fg5 fg5Var) {
        if (fg5Var != null) {
            this.S0 = fg5Var;
            return this;
        }
        b(35);
        throw null;
    }

    public final nv30 h(lht lhtVar) {
        if (lhtVar != null) {
            this.d = lhtVar;
            return this;
        }
        b(12);
        throw null;
    }

    public final nv30 j() {
        this.Z = false;
        return this;
    }

    public final nv30 m(n9r n9rVar) {
        this.b = n9rVar;
        return this;
    }

    public final nv30 n() {
        this.R0 = z6x.a;
        return this;
    }

    public final nv30 o() {
        this.Q0 = true;
        return this;
    }

    public final nv30 q(int i) {
        if (i != 0) {
            this.c = i;
            return this;
        }
        b(10);
        throw null;
    }

    public final nv30 t(a8b0 a8b0Var) {
        if (a8b0Var != null) {
            this.X = a8b0Var;
            return this;
        }
        b(23);
        throw null;
    }

    public final nv30 w() {
        this.O0 = true;
        return this;
    }
}
