package p;

import android.content.ContentValues;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nl5 {
    public final y36 a = new y36(0);

    public final String getAppId() {
        String string;
        Object obj = this.a.get("packageName");
        return (obj == null || (string = obj.toString()) == null) ? "" : string;
    }

    public final ContentValues getContentValues$continuity_release() {
        ContentValues contentValues = new ContentValues();
        y36 y36Var = this.a;
        for (String str : (t36) y36Var.keySet()) {
            Object obj = y36Var.get(str);
            if (obj instanceof Double) {
                contentValues.put(str, (Double) obj);
            } else if (obj instanceof Boolean) {
                contentValues.put(str, (Boolean) obj);
            } else if (obj instanceof Integer) {
                contentValues.put(str, (Integer) obj);
            } else if (obj instanceof Long) {
                contentValues.put(str, (Long) obj);
            } else if (obj instanceof byte[]) {
                contentValues.put(str, (byte[]) obj);
            } else {
                contentValues.put(str, String.valueOf(obj));
            }
        }
        return contentValues;
    }

    public final String getContextId() {
        String string;
        Object obj = this.a.get("contextId");
        return (obj == null || (string = obj.toString()) == null) ? "" : string;
    }

    public final long getLastUpdatedTime() {
        String string;
        Object obj = this.a.get("lastUpdatedTime");
        if (obj == null || (string = obj.toString()) == null) {
            return -1L;
        }
        return Long.parseLong(string);
    }

    public final long getLifeTime() {
        String string;
        Object obj = this.a.get("lifeTime");
        if (obj == null || (string = obj.toString()) == null) {
            return -1L;
        }
        return Long.parseLong(string);
    }

    public final int getType() {
        String string;
        Object obj = this.a.get("requestedContextType");
        if (obj == null || (string = obj.toString()) == null) {
            return 0;
        }
        return Integer.parseInt(string);
    }

    public final boolean hasValue$continuity_release(String str) {
        return this.a.containsKey(str);
    }

    public final void setAction$continuity_release(String str) {
        this.a.put("action", str);
    }

    public final void setAppId(String str) {
        this.a.put("packageName", str);
    }

    public final void setContextId(String str) {
        this.a.put("contextId", str);
    }

    public final void setCreateTime(long j) {
        this.a.put("createTime", Long.valueOf(j));
    }

    public final void setIntentUri(String str) {
        if (str.length() <= 2083) {
            this.a.put("intentUri", str);
        } else {
            hhg1.n("intentUri exceeds the maximum length of 2083 characters");
        }
    }

    public final void setLastUpdatedTime(long j) {
        this.a.put("lastUpdatedTime", Long.valueOf(j));
    }

    public final void setLifeTime(long j) {
        this.a.put("lifeTime", Long.valueOf(j));
    }

    public final void setTriggerType$continuity_release(String str) {
        this.a.put("triggerType", str);
    }

    public final void setType(int i) {
        this.a.put("requestedContextType", Integer.valueOf(i));
    }

    public final void setVersion$continuity_release(double d) {
        this.a.put("version", Double.valueOf(d));
    }
}
