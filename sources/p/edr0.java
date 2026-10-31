package p;

import java.util.LinkedHashMap;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class edr0 {
    public final /* synthetic */ byte a;
    public final LinkedHashMap b;

    public edr0(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new LinkedHashMap();
                break;
            default:
                this.b = new LinkedHashMap();
                break;
        }
    }

    public final UUID a(of61 of61Var) {
        byte b = this.a;
        LinkedHashMap linkedHashMap = this.b;
        switch (b) {
            case 0:
                UUID uuidRandomUUID = UUID.randomUUID();
                linkedHashMap.put(of61Var, uuidRandomUUID);
                uuidRandomUUID.getClass();
                return uuidRandomUUID;
            default:
                UUID uuidRandomUUID2 = UUID.randomUUID();
                linkedHashMap.put(of61Var, uuidRandomUUID2);
                return uuidRandomUUID2;
        }
    }

    public final UUID b(of61 of61Var) {
        byte b = this.a;
        LinkedHashMap linkedHashMap = this.b;
        switch (b) {
            case 0:
                UUID uuid = (UUID) linkedHashMap.get(of61Var);
                return uuid == null ? a(of61Var) : uuid;
            default:
                UUID uuid2 = (UUID) linkedHashMap.get(of61Var);
                return uuid2 == null ? a(of61Var) : uuid2;
        }
    }

    public final void c(of61 of61Var, String str) {
        byte b = this.a;
        LinkedHashMap linkedHashMap = this.b;
        switch (b) {
            case 0:
                if (str != null) {
                    linkedHashMap.put(of61Var, UUID.fromString(str));
                }
                break;
            default:
                if (str != null) {
                    linkedHashMap.put(of61Var, UUID.fromString(str));
                }
                break;
        }
    }
}
