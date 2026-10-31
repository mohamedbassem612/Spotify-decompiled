package p;

import android.content.SharedPreferences;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ezx implements SharedPreferences.Editor {
    public final hzx a;
    public final SharedPreferences.Editor b;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public ezx(hzx hzxVar, SharedPreferences.Editor editor) {
        this.a = hzxVar;
        this.b = editor;
    }

    public final void a() {
        if (this.d.getAndSet(false)) {
            hzx hzxVar = this.a;
            for (String str : ((HashMap) hzxVar.getAll()).keySet()) {
                if (!this.c.contains(str) && !hzx.d(str)) {
                    this.b.remove(hzxVar.b(str));
                }
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        a();
        this.b.apply();
        b();
        this.c.clear();
    }

    public final void b() {
        hzx hzxVar = this.a;
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : hzxVar.b) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(hzxVar, (String) it.next());
            }
        }
    }

    public final void c(String str, byte[] bArr) {
        hzx hzxVar = this.a;
        if (hzx.d(str)) {
            throw new SecurityException(f4i1.e(str, " is a reserved key for the encryption keyset."));
        }
        this.c.add(str);
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strB = hzxVar.b(str);
            Pair pair = new Pair(strB, p9a.b(hzxVar.d.a(bArr, strB.getBytes(StandardCharsets.UTF_8))));
            this.b.putString((String) pair.first, (String) pair.second);
        } catch (GeneralSecurityException e) {
            jah.k("Could not encrypt data: ", e.getMessage(), e);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.d.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        a();
        try {
            return this.b.commit();
        } finally {
            b();
            copyOnWriteArrayList.clear();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.putInt(rjx.d(6));
        byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(rjx.d(5));
        byteBufferAllocate.putFloat(f);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(rjx.d(3));
        byteBufferAllocate.putInt(i);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(rjx.d(4));
        byteBufferAllocate.putLong(j);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
        byteBufferAllocate.putInt(rjx.d(1));
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.put(bytes);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        if (set == null) {
            set = new d46(0);
            set.add("__NULL__");
        }
        ArrayList<byte[]> arrayList = new ArrayList(set.size());
        int size = set.size() * 4;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
        byteBufferAllocate.putInt(rjx.d(2));
        for (byte[] bArr : arrayList) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        if (hzx.d(str)) {
            throw new SecurityException(f4i1.e(str, " is a reserved key for the encryption keyset."));
        }
        this.b.remove(this.a.b(str));
        this.c.remove(str);
        return this;
    }
}
