package p;

import com.spotify.base.java.logging.Logger;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class v420 {
    public final File a;
    public uyx0 b;
    public long c;
    public boolean d;
    public final /* synthetic */ w420 e;

    public v420(w420 w420Var, File file) {
        this.e = w420Var;
        this.a = file;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    public final void a() {
        u420 u420Var;
        if (this.d) {
            return;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(this.a)));
            try {
                byte b = dataInputStream.readByte();
                if (b == 1) {
                    u420Var = new u420(new syx0(dataInputStream.readUTF()), 0L);
                } else if (b == 2) {
                    int i = dataInputStream.readInt();
                    if (i < 0 || i >= 1001) {
                        u420Var = null;
                    } else {
                        ArrayList arrayList = new ArrayList(i);
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayList.add(dataInputStream.readUTF());
                        }
                        u420Var = new u420(new tyx0(arrayList), dataInputStream.readLong());
                    }
                } else if (b != 3) {
                    u420Var = null;
                } else {
                    u420Var = new u420(new ryx0(dataInputStream.readUTF()), dataInputStream.readLong());
                }
                dataInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(dataInputStream, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            Logger.e(e, "Failed to read persisted prompt suggestions", new Object[0]);
            u420Var = null;
        }
        this.b = u420Var != null ? u420Var.a : null;
        this.c = u420Var != null ? u420Var.b : 0L;
        this.d = true;
    }

    public final boolean b(String str) {
        uyx0 uyx0Var = this.b;
        syx0 syx0Var = uyx0Var instanceof syx0 ? (syx0) uyx0Var : null;
        return u890.j(syx0Var != null ? syx0Var.a : null, str);
    }

    public final void c(uyx0 uyx0Var) {
        File file = this.a;
        try {
            File file2 = new File(file.getParentFile(), file.getName() + ".tmp");
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file2)));
            try {
                if (uyx0Var instanceof syx0) {
                    dataOutputStream.writeByte(1);
                    dataOutputStream.writeUTF(((syx0) uyx0Var).a);
                } else if (uyx0Var instanceof tyx0) {
                    dataOutputStream.writeByte(2);
                    dataOutputStream.writeInt(((tyx0) uyx0Var).a.size());
                    Iterator it = ((tyx0) uyx0Var).a.iterator();
                    while (it.hasNext()) {
                        dataOutputStream.writeUTF((String) it.next());
                    }
                    dataOutputStream.writeLong(this.c);
                } else {
                    if (!(uyx0Var instanceof ryx0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dataOutputStream.writeByte(3);
                    dataOutputStream.writeUTF(((ryx0) uyx0Var).a);
                    dataOutputStream.writeLong(this.c);
                }
                dataOutputStream.close();
                if (file2.renameTo(file)) {
                    return;
                }
                Logger.d("Failed to persist prompt suggestions", new Object[0]);
                file2.delete();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(dataOutputStream, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            Logger.e(e, "Failed to persist prompt suggestions", new Object[0]);
        }
    }
}
